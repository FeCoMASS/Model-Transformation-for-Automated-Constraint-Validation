package slingshot;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
component Slingshot {
	port << condition = "x.numberOfUsers > 0 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.responseTime > 0.0" >> out UsageSimulationReturn usageSimulationReturn;
	component ResourceSimulation {
		port << delayed,  condition = "x.utilization > 0.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 0.0" >> in ResourceDemand resourceDemand;
	}
	component UsageSimulation {
		port << condition = "x.responseTime > 0.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
		port in SystemSimulationReturn systemSimulationReturn;
	}
	component SystemSimulation {
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.method == \"asdf\"" >> in SystemCall systemCall;
		port << condition = "x.utilization > 0.0" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 0.0" >> out ResourceDemand resourceDemand;
	}
	ResourceSimulation resourceSimulation;
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
