package slingshot;
import cd2pojo.slingshot.Slingshot.Artifact;
import cd2pojo.slingshot.Slingshot.ArtifactSimulationReturn;
import cd2pojo.slingshot.Slingshot.ArtData;
import cd2pojo.slingshot.Slingshot.CompositeDataType4;
component Slingshot {
	port in Artifact artifact_id;
	port out ArtifactSimulationReturn artifactSimulationReturn;
	component Artifact {
		port << condition = "x.id isin R\"@[a-zA-Z0-9$_]{1,20}![a-zA-Z0-9]{1,20}\"" >> in ArtData artData2;
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData;
		port out CompositeDataType4 object;
	}
	component GPLExtractor {
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port in Artifact artifact_id;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension && x.simpleName isin R\"[a-zA-Z_$][a-zA-Z_0-9]+\" && x.nameExtension isin R\"[a-zA-Z_$][a-zA-Z_0-9]+\"" >> out ArtData artData2;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	Artifact artifact;
	GPLExtractor gPLExtractor;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ChangeImpact changeImpact;
	assembly_TemplateExtractor.artData2 -> artifact.artData2;
	artifact.object -> changeImpact.object;
	gPLExtractor.artData -> artifact.artData;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
