# Model-Transformation-for-Automated-Constraint-Validation

This repository contains the sources of our tool for the paper "Semantics Enhancing Model Transformation for Automated Constraint Validation of Palladio Software Architecture to MontiArc Models". The tool supports the transformation of software architecture models modeled in the Palladio Bench to textual MontiArc models. During this transformation the MontiArc model is enriched with constraints specified in an additional input model. Afterwards, the constraints in the MontiArc model can be checked.

## Subfolders
The following subfolders are part of this repository and will be explained here. While it is possible to setup our tool base don a fresh eclipse install, we recommend using the preconfigured eclipse in the drop folder. Please contact [Sebastian Weber] if you wish to setup the tool manually.
### drop
This folder contains a preconfigured eclipse. Please refer to the [Video Tutorial] if the following explanations are not sufficient.
Please unzip the Eclipse.zip, start the eclipse.exe and select the workspace folder as workspace. Afterwards you can execute the two steps of our tool by selecting the run configurations at the play symbol in the menu. The first step is "1 PCMToMontiArc", which generates the enriched MontiArc model. The second stepo is "2 CheckConstraints", which formats the output of the first step and checks the validity of the constraints. The output of the tool is in the eclipse console.
### example
The example we use is in this folder. It contains the three input files Slingshot.repository, Slingshot.system and Constraints.ecore. In addition, the output PCMToMontiArc.montiarcandcore is also included and the representations.aird file, which is responsible for the graphical representation of the repository and system.
### grammar
The grammar consists of three mostly generated projects and a zip-file containing these projects packaged as eclipse plugins. Therefor, the content of the zip-file can be pasted into the dropins folder of an eclipse to add support for montiarcandcore models. The XText grammar itself can be found at org.palladiosimulator.xtext.montiarcandcore\src\org\palladiosimulator\xtext\montiarcandcore\MontiArcAndCore.xtext.
### transformation
This folder contains the project for the QVTo transformation to and enrichment of the MontiArc model.
### validation
The jar containing the model syntax and constraint checking functionality in the lib folder together with a class for its execution in the src folder are in this project. Due to size restrictions of github, the jar has been compressed.

## Technical Details
The tool is based on the [Eclipse IDE] and uses [QVTo] to transform PCM models to MontiArc models. To bridge the gap between the PCM, which is specified as an [Ecore] model, and the grammar specification of MontiArc, we use a [XText] grammar for MontiArc. This enables us to directly transform elements from the PCM model to the Ecore model that Xtext generated based on the Xtext version of the MontiArc grammar. The PCM models are modeled with the [Palladio Bench] and the constraints are from an Ecore model with annotations referencing the components and roles that should be enriched by the constraints.

[Eclipse IDE]: <https://eclipseide.org/>
[QVTo]: <https://wiki.eclipse.org/QVTo>
[Ecore]: <https://wiki.eclipse.org/Ecore>
[XText]: <https://eclipse.dev/Xtext/>
[Palladio Bench]: <https://www.palladio-simulator.com/>
[Video Tutorial]: <https://fecomass.github.io/fecomass/videos/>
[Sebastian Weber]: <mailto:sebastian.weber@fzi.de>