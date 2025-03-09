package slingshot;
import cd2pojo.slingshot.Slingshot.ArtifactSimulationReturn;
import cd2pojo.slingshot.Slingshot.Artifact;
import cd2pojo.slingshot.Slingshot.CompositeDataType4;
import cd2pojo.slingshot.Slingshot.ArtData;
component Slingshot {
	port in Artifact artifact_id;
	port out ArtifactSimulationReturn artifactSimulationReturn;
	component Assembly_TemplateExtractor {
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData2;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	component GPLExtractor {
		port in Artifact artifact_id;
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component Artifact {
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData;
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData2;
		port out CompositeDataType4 object;
	}
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ChangeImpact changeImpact;
	GPLExtractor gPLExtractor;
	Artifact artifact;
	gPLExtractor.artData -> artifact.artData;
	artifact.object -> changeImpact.object;
	assembly_TemplateExtractor.artData2 -> artifact.artData2;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
