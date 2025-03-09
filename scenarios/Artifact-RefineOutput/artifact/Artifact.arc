package artifact;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.CompositeDataType4;
import cd2pojo.artifact.Artifact.ArtData;
component Artifact {
	port in Artifact artifact_id;
	port out ArtifactSimulationReturn artifactSimulationReturn;
	component GPLExtractor {
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port in Artifact artifact_id;
		port << condition = "x.simpleName isin R\"[A-Z][a-zA-Z0-9]{0,19}\" && x.nameExtension == \"java\" &&  x.id == \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	component Assembly_TemplateExtractor {
		port out ArtData artData2;
	}
	component ArtifactValidator {
		port in ArtData artData2;
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData;
		port out CompositeDataType4 object;
	}
	GPLExtractor gPLExtractor;
	ChangeImpact changeImpact;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ArtifactValidator artifactValidator;
	gPLExtractor.artData -> artifactValidator.artData;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifactValidator.object -> changeImpact.object;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
