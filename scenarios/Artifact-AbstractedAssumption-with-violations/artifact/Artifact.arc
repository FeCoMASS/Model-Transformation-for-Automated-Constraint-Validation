package artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.ArtData;
import cd2pojo.artifact.Artifact.CompositeDataType4;
component Artifact {
	port out ArtifactSimulationReturn artifactSimulationReturn;
	port in Artifact artifact_id;
	component Assembly_TemplateExtractor {
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData2;
	}
	component ArtifactValidator {
		port << condition = "x.id isin R\"@.{1,20}!.{1,20}\"" >> in ArtData artData;
		port << condition = "x.id isin R\"@.{1,20}!.{10,20}\"" >> in ArtData artData2;
		port out CompositeDataType4 object;
	}
	component GPLExtractor {
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port in Artifact artifact_id;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]+\" &&  x.nameExtension isin R\"[a-zA-Z]+\" &&  x.id == \"@\"+ x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ArtifactValidator artifactValidator;
	GPLExtractor gPLExtractor;
	ChangeImpact changeImpact;
	gPLExtractor.artData -> artifactValidator.artData;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifactValidator.object -> changeImpact.object;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
