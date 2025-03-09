package slingshot;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceType;
import cd2pojo.slingshot.Slingshot.ResourceType;
component Slingshot {
	port << condition = "x.numberOfUsers > 0 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
	component ResourceSimulation {
		port << condition = "x.resourceDemand > 10.0" >> in ResourceDemand resourceDemand;
		port << delayed,  condition = "x.utilization > 1.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.active == false" >> in ResourceType active;
	}
	component PassiveResourceSimulation {
		port << condition = "x.passive == true" >> in ResourceType passive;
	}
	component UsageSimulation {
		port << condition = "x.responseTime > 10.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << condition = "x.numberOfUsers > 10" >> in UsageScenario usageScenario;
		port in SystemSimulationReturn systemSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
	}
	component SystemSimulation {
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.method == \"executeOperation\"" >> in SystemCall systemCall;
		port << condition = "x.active == false && x.passive == false" >> out ResourceType passive;
		port << condition = "x.utilization > 10.0" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> out ResourceDemand resourceDemand;
		port << condition = "x.active == true && x.passive == false" >> out ResourceType active;
	}
	ResourceSimulation resourceSimulation;
	PassiveResourceSimulation passiveResourceSimulation;
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	systemSimulation.active -> resourceSimulation.active;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.passive -> passiveResourceSimulation.passive;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
