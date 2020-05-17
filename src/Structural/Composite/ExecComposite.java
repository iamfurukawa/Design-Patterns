package Structural.Composite;

public class ExecComposite {
	
	public static void main(String[] args) {
		Docker docker = new Docker();
		
		docker.createApplication(new JVM());
		docker.createApplication(new Jenkins());
		
		Docker innerDocker = new Docker("Inner Docker");
		docker.createApplication(innerDocker);
		
		innerDocker.createApplication(new Node());
		innerDocker.createApplication(new SonarQube());
		
		int memoryUsedByAll = docker.calculateAllMemoryUsed();
		System.out.println("Total memory used: " + memoryUsedByAll);
	}
}