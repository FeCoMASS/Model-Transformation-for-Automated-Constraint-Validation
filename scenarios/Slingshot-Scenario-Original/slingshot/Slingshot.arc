package slingshot;
import cd2pojo.slingshot.Slingshot.UsageScenario;
import cd2pojo.slingshot.Slingshot.UsageSimulationReturn;
import cd2pojo.slingshot.Slingshot.ResourceDemand;
import cd2pojo.slingshot.Slingshot.ResourceSimulationReturn;
import cd2pojo.slingshot.Slingshot.SystemCall;
import cd2pojo.slingshot.Slingshot.SystemSimulationReturn;
component Slingshot {
	port << condition = "x.responseTime > 0.0" >> out UsageSimulationReturn usageSimulationReturn;
	port << condition = "if x.closedWorkload == true then ( x.numberOfUsers > 0 && x.numberOfUsers <\n2147483647) else x.interval > 0.0" >> in UsageScenario usageScenario;
	component UsageSimulation {
		port << condition = "if x.closedWorkload then x.numberOfUsers > 0 else x.interval > 0.0" >> in UsageScenario usageScenario;
		port << condition = "x.responseTime > 0.0" >> out UsageSimulationReturn usageSimulationReturn;
		port << delayed,  condition = "x.method == \"asdf\"" >> out SystemCall systemCall;
		port in SystemSimulationReturn systemSimulationReturn;
	}
	component SystemSimulation {
		port << condition = "x.method == \"asdf\"" >> in SystemCall systemCall;
		port out SystemSimulationReturn systemSimulationReturn;
		port << condition = "( x.totalTime > 0.0 && x.busyTime > 0.0) implies (x.utilization > 0.0)" >> in ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 0.0" >> out ResourceDemand resourceDemand;
	}
	component ResourceSimulation {
		port << delayed,  condition = "( x.totalTime > 0.0 && x.busyTime > 0.0) implies ( x.utilization == x.busyTime / x.totalTime && x.utilization > 0.0)" >> out ResourceSimulationReturn resourceSimulationReturn;
		port << condition = "x.resourceDemand > 0.0" >> in ResourceDemand resourceDemand;
	}
	UsageSimulation usageSimulation;
	SystemSimulation systemSimulation;
	ResourceSimulation resourceSimulation;
	usageSimulation.systemCall -> systemSimulation.systemCall;
	systemSimulation.systemSimulationReturn -> usageSimulation.systemSimulationReturn;
	resourceSimulation.resourceSimulationReturn -> systemSimulation.resourceSimulationReturn;
	systemSimulation.resourceDemand -> resourceSimulation.resourceDemand;
	usageScenario -> usageSimulation.usageScenario;
	usageSimulation.usageSimulationReturn -> usageSimulationReturn;
}
