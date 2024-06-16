package org.palladiosimulator.xtext.montiarc.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class CheckConstraints {
	
	public static void main(String[] args) {
		File file = new File(args[0]);
		BufferedReader br;
		String line;
		CompilationUnit classDiagram = new CompilationUnit();
		CompilationUnit montiArcDiagram = new CompilationUnit();
		CompilationUnit currentCompilationUnit = classDiagram;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				if (line.contains("package") && currentCompilationUnit.hasPackage()) {
					currentCompilationUnit = montiArcDiagram;
				}
				currentCompilationUnit.addContent(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File parent = file.getParentFile();
		
		File classDiagramFile = new File(parent + "/" + classDiagram.getPackageName().replace(".", "/") + "/" + classDiagram.getUnitName() + ".cd");
		classDiagramFile.getParentFile().mkdirs();
		try {
			classDiagramFile.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(classDiagramFile));
			for (String content : classDiagram.getContent()) {
				bw.write(content + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File montiArcDiagramFile = new File(parent + "/" + montiArcDiagram.getPackageName().replace(".", "/") + "/" + montiArcDiagram.getUnitName() + ".arc");
		montiArcDiagramFile.getParentFile().mkdirs();
		try {
			montiArcDiagramFile.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(montiArcDiagramFile));
			for (String content : montiArcDiagram.getContent()) {
				bw.write(content + "\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Process proc = Runtime.getRuntime().exec("java -jar lib/slingshot-montiarc-model-jar-with-dependencies.jar -mp " + montiArcDiagramFile.getAbsolutePath() + " -cd " + classDiagramFile.getAbsolutePath() + " -cc");
			InputStream in = proc.getInputStream();
			InputStream err = proc.getErrorStream();
			in.transferTo(System.out);
			err.transferTo(System.err);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
