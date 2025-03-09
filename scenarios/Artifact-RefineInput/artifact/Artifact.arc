package artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.ArtData;
import cd2pojo.artifact.Artifact.CompositeDataType4;
component Artifact {
	port in Artifact artifact_id;
	port out ArtifactSimulationReturn artifactSimulationReturn;
	component ArtifactValidator {
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData2;
		port << condition = "x.id isin R\"@[a-zA-Z0-9]{1,20}![a-z][a-zA-Z0-9]{0,19}\"" >> in ArtData artData;
		port out CompositeDataType4 object;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension && x.simpleName isin R\"[a-zA-Z][a-zA-Z_0-9]+\" && x.nameExtension isin R\"[a-zA-Z][a-zA-Z_0-9]+\"" >> out ArtData artData2;
	}
	component GPLExtractor {
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port in Artifact artifact_id;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	ArtifactValidator artifactValidator;
	ChangeImpact changeImpact;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	GPLExtractor gPLExtractor;
	gPLExtractor.artData -> artifactValidator.artData;
	artifactValidator.object -> changeImpact.object;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
