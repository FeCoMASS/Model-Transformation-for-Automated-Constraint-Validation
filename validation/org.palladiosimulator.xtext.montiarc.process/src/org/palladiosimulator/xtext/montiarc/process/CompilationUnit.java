package org.palladiosimulator.xtext.montiarc.process;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnit {
	private String packageName;
	private String unitName;
	private List<String> content = new ArrayList<String>();
	
	public void addContent(String content) {
		if (content.startsWith("package")) {
			this.packageName = content.replace("package", "").replace(";", "").trim();
		}
		if (content.startsWith("classdiagram")) {
			this.unitName = content.replace("classdiagram", "").replace("{", "").trim();
		}
		if (content.startsWith("component")) {
			this.unitName = content.replace("component", "").replace("{", "").trim();
		}
		this.content.add(content);
	}
	
	public boolean hasPackage() {
		return this.packageName != null;
	}
	
	public void printContent() {
		System.out.println("CompilationUnit: " + this.unitName);
		System.out.println("Package: " + this.packageName);
		for (String content : this.content) {
			System.out.println(content);
		}
	}

	public String getPackageName() {
		return packageName;
	}

	public String getUnitName() {
		return unitName;
	}

	public List<String> getContent() {
		return content;
	}
	
	
}