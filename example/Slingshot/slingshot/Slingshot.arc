package slingshot;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
component Slingshot {
	port << condition = "x.numberOfUsers > 0 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
	component UsageSimulation {
		port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
		port in SystemSimulationReturn systemSimulationReturn;
	}
	component SystemSimulation {
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.method == \"asdf\"" >> in SystemCall systemCall;
		port << condition = "x.resourceDemand > 1.0" >> out ResourceDemand resourceDemand;
		port << condition = "x.utilization > 1.0" >> in ResourceSimulationReturn resourceSimulationReturn;
	}
	component ResourceSimulation {
		port << delayed,  condition = "x.utilization > 1.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> in ResourceDemand resourceDemand;
	}
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	ResourceSimulation resourceSimulation;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
