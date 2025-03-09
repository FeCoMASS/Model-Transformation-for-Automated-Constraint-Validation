package slingshot;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.ResourceType;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.ResourceType;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemCall;
component Slingshot {
	port << condition = "x.numberOfUsers > 0 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
	component UsageSimulation {
		port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
		port in SystemSimulationReturn systemSimulationReturn;
	}
	component PassiveResourceSimulation {
		port << condition = "x.passive == true" >> in ResourceType passive;
	}
	component SystemSimulation {
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.method == \"asdf\"" >> in SystemCall systemCall;
		port << condition = "x.active == true && x.passive == false" >> out ResourceType active;
		port << condition = "x.utilization > 1.0" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> out ResourceDemand resourceDemand;
		port << condition = "x.active == false && x.passive == true" >> out ResourceType passive;
	}
	component ResourceSimulation {
		port << condition = "x.active == true" >> in ResourceType active;
		port << delayed,  condition = "x.utilization > 1.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> in ResourceDemand resourceDemand;
	}
	UsageSimulation usageSimulation;
	PassiveResourceSimulation passiveResourceSimulation;
	SystemSimulation systemSimulation;
	ResourceSimulation resourceSimulation;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	systemSimulation.active -> resourceSimulation.active;
	systemSimulation.passive -> passiveResourceSimulation.passive;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
