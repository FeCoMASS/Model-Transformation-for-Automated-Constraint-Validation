package artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.CompositeDataType4;
import cd2pojo.artifact.Artifact.ArtData;
component Artifact {
	port in Artifact artifact_id;
	port out ArtifactSimulationReturn artifactSimulationReturn;
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	component GPLExtractor {
		port in Artifact artifact_id;
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port << condition = "x.simpleName isin R\"[A-Z][a-zA-Z0-9]{0,19}\" && x.nameExtension == \"java\" &&  x.id == \"@\" + x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component ArtifactValidator {
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z_$]{10,15}\"" >> in ArtData artData;
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData2;
		port out CompositeDataType4 object;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension && x.simpleName isin R\"[a-zA-Z][a-zA-Z_0-9]+\" && x.nameExtension isin R\"[a-zA-Z][a-zA-Z_0-9]+\"" >> out ArtData artData2;
	}
	ChangeImpact changeImpact;
	GPLExtractor gPLExtractor;
	ArtifactValidator artifactValidator;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	gPLExtractor.artData -> artifactValidator.artData;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifactValidator.object -> changeImpact.object;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
