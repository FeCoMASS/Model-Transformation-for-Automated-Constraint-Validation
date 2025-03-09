package slingshot;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
component Slingshot {
	port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
	port << condition = "x.numberOfUsers < 100 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	component UsageSimulation {
		port << condition = "x.responseTime < 0.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port in SystemSimulationReturn systemSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
	}
	component SystemSimulation {
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.method == \"executeOperation\"" >> in SystemCall systemCall;
		port << condition = "x.utilization > 1.0" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 10.0" >> out ResourceDemand resourceDemand;
	}
	component ResourceSimulation {
		port << condition = "x.resourceDemand < 1.0" >> in ResourceDemand resourceDemand;
		port << delayed,  condition = "x.utilization > 10.0" >> out ResourceSimulationReturn resourceSimulationReturn;
	}
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	ResourceSimulation resourceSimulation;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
