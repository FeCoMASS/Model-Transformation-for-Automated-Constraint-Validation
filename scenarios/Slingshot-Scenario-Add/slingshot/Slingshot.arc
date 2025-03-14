package slingshot;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.Latency;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
import cd2pojo.slingshot.Slingshot.ServerLoad;
component Slingshot {
	port << condition = "x.numberOfUsers > 0 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
	component ResourceSimulation {
		port << condition = "x.resourceDemand > 1.0" >> in ResourceDemand resourceDemand;
		port << delayed,  condition = "x.utilization > 1.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.latency > 0.0" >> in Latency latency;
		port << condition = "x.serverLoad > 0.0" >> out ServerLoad serverLoad;
	}
	component UsageSimulation {
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
		port in SystemSimulationReturn systemSimulationReturn;
	}
	component SystemSimulation {
		port << condition = "x.method == \"asdf\"" >> in SystemCall systemCall;
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> out ResourceDemand resourceDemand;
		port << condition = "x.utilization > 1.0" >> in ResourceSimulationReturn resourceSimulationReturn;
	}
	component NetworkSimulation {
		port << condition = "x.serverLoad > 0.0" >> in ServerLoad serverLoad;
		port << delayed,  condition = "x.latency > 0.0" >> out Latency latency;
	}
	ResourceSimulation resourceSimulation;
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	NetworkSimulation networkSimulation;
	resourceSimulation.serverLoad -> networkSimulation.serverLoad;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	networkSimulation.latency -> resourceSimulation.latency;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
