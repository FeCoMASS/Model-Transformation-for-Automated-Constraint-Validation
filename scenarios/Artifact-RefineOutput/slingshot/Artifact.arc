package slingshot;
import cd2pojo.slingshot.Slingshot.Artifact;
import cd2pojo.slingshot.Slingshot.ArtifactSimulationReturn;
import cd2pojo.slingshot.Slingshot.ArtData;
import cd2pojo.slingshot.Slingshot.CompositeDataType4;
component Slingshot {
	port out ArtifactSimulationReturn artifactSimulationReturn;
	port in Artifact artifact_id;
	component GPLExtractor {
		port in Artifact artifact_id;
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port << condition = "x.simpleName isin R\"[A-Z][a-zA-Z0-9]{0,19}\" && x.nameExtension == \"java\" &&  x.id == \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension && x.simpleName isin R\"[a-zA-Z][a-zA-Z_0-9]+\" && x.nameExtension isin R\"[a-zA-Z][a-zA-Z_0-9]+\"" >> out ArtData artData2;
	}
	component ArtifactValidator {
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData;
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData2;
		port out CompositeDataType4 object;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	GPLExtractor gPLExtractor;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ArtifactValidator artifactValidator;
	ChangeImpact changeImpact;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifactValidator.object -> changeImpact.object;
	gPLExtractor.artData -> artifactValidator.artData;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
