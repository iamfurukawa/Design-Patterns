package Structural.Composite;

import java.util.ArrayList;

public abstract class Application implements IApplication {

	private String applicationName;
	private int memoryUsed;
	private ArrayList<Application> applications = new ArrayList<>();

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public int getMemoryUsed() {
		return memoryUsed;
	}

	public void setMemoryUsed(int memoryUsed) {
		this.memoryUsed = memoryUsed;
	}

	public void printName() {
		System.out.println("Application: " + applicationName);
	}

	public int calculateAllMemoryUsed() {
		
		int childMemoryApplications = 0;
		
		System.out.println("Visiting application: " + applicationName + " using " + memoryUsed + "gb.");
		
		for (Application application : applications) {
			childMemoryApplications += memoryUsed; 
			application.calculateAllMemoryUsed();
		}
		
		return childMemoryApplications;
	}

	public void createApplication(final Application application) {
		applications.add(application);
	}
}
