package artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.ArtData;
import cd2pojo.artifact.Artifact.CompositeDataType4;
component Artifact {
	port out ArtifactSimulationReturn artifactSimulationReturn;
	port in Artifact artifact_id;
	component GPLExtractor {
		port in Artifact artifact_id;
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]+\" &&  x.nameExtension isin R\"[a-zA-Z]+\" &&  x.id == \"@\"+ x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	component ArtifactValidator {
		port << condition = "x.id isin R\"@.+!.+\"" >> in ArtData artData;
		port << condition = "x.id isin R\"@[a-zA-Z0-9_$]{1,20}![a-zA-Z0-9]{1,20}\"" >> in ArtData artData2;
		port out CompositeDataType4 object;
	}
	component ChangeImpact {
		port in CompositeDataType4 object;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData2;
	}
	GPLExtractor gPLExtractor;
	ArtifactValidator artifactValidator;
	ChangeImpact changeImpact;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	artifactValidator.object -> changeImpact.object;
	gPLExtractor.artData -> artifactValidator.artData;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
