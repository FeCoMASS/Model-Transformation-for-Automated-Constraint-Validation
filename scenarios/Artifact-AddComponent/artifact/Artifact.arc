package artifact;
import cd2pojo.artifact.Artifact.ArtifactSimulationReturn;
import cd2pojo.artifact.Artifact.Artifact;
import cd2pojo.artifact.Artifact.ArtData;
import cd2pojo.artifact.Artifact.ArtData;
import cd2pojo.artifact.Artifact.ObjectDiagram;
component Artifact {
	port out ArtifactSimulationReturn artifactSimulationReturn;
	port in Artifact artifact_id;
	component ArtifactValidator {
		port << condition = "x.id isin R\"@[a-zA-Z_0-9]{1,20}![a-zA-Z]{1,20}\"" >> in ArtData artData2;
		port << condition = "x.id isin R\"@.{1,20}!.{1,20}\"" >> in ArtData artData;
		port out ArtData artData3;
	}
	component Assembly_TemplateExtractor {
		port << condition = "x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension && x.simpleName isin R\"[a-zA-Z][a-zA-Z_0-9]+\" && x.nameExtension isin R\"[a-zA-Z][a-zA-Z_0-9]+\"" >> out ArtData artData2;
	}
	component ChangeImpact {
		port in ObjectDiagram objDiagram;
	}
	component Merger {
		port in ArtData artData3;
		port out ObjectDiagram objDiagram;
	}
	component GPLExtractor {
		port in Artifact artifact_id;
		port out ArtifactSimulationReturn artifactSimulationReturn;
		port << condition = "x.simpleName isin R\"[a-zA-Z0-9]{1,20}\" && x.nameExtension isin R\"[a-zA-Z]{1,20}\" && x.id ==  \"@\"+ x.simpleName + \"!\" + x.nameExtension" >> out ArtData artData;
	}
	ArtifactValidator artifactValidator;
	Assembly_TemplateExtractor assembly_TemplateExtractor;
	ChangeImpact changeImpact;
	Merger merger;
	GPLExtractor gPLExtractor;
	merger.objDiagram -> changeImpact.objDiagram;
	assembly_TemplateExtractor.artData2 -> artifactValidator.artData2;
	artifactValidator.artData3 -> merger.artData3;
	gPLExtractor.artData -> artifactValidator.artData;
	artifact_id -> gPLExtractor.artifact_id;
	gPLExtractor.artifactSimulationReturn -> artifactSimulationReturn;
}
