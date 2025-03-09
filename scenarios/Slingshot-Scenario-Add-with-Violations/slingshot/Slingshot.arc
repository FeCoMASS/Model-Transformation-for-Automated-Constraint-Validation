package slingshot;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.Latency;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
import cd2pojo.slingshot.Slingshot.ServerLoad;
component Slingshot {
	port << condition = "x.responseTime > 10.0" >> out UsageSimulationReturn usageSimulationReturn;
	port << condition = "x.numberOfUsers > 10 && x.numberOfUsers < 2147483647" >> in UsageScenario usageScenario;
	component NetworkSimulation {
		port << condition = "x.serverLoad > 0.0" >> in ServerLoad serverLoad;
		port << delayed,  condition = "x.latency > 10.0" >> out Latency latency;
	}
	component ResourceSimulation {
		port << delayed,  condition = "x.utilization > 0.0" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 1.0" >> in ResourceDemand resourceDemand;
		port << condition = "x.latency > 0.0" >> in Latency latency;
		port << condition = "x.serverLoad > 100.0" >> out ServerLoad serverLoad;
	}
	component SystemSimulation {
		port << condition = "x.method == \"executeOperation\"" >> in SystemCall systemCall;
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "x.utilization > 10.0" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 0.0" >> out ResourceDemand resourceDemand;
	}
	component UsageSimulation {
		port << condition = "x.numberOfUsers > 0" >> in UsageScenario usageScenario;
		port << condition = "x.responseTime > 1.0" >> out UsageSimulationReturn usageSimulationReturn;
		port in SystemSimulationReturn systemSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
	}
	NetworkSimulation networkSimulation;
	ResourceSimulation resourceSimulation;
	SystemSimulation systemSimulation;
	UsageSimulation usageSimulation;
	resourceSimulation.serverLoad -> networkSimulation.serverLoad;
	networkSimulation.latency -> resourceSimulation.latency;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
