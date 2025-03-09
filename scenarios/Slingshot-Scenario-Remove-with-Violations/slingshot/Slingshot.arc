package slingshot;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.SystemCall;
component Slingshot {
	port << condition = "x.numberOfUsers > 10 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.usersPerService > 1" >> out UsageSimulationReturn usageSimulationReturn;
	component UsageSimulation {
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << condition = "x.usersPerService > 0" >> out UsageSimulationReturn usageSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
	}
	component SystemSimulation {
		port << condition = "x.method == \"executeOperation\"" >> in SystemCall systemCall;
	}
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
