package Structural.Composite;

public class Docker extends Application {
	
	public Docker() {
		setApplicationName("Docker");
		setMemoryUsed(16 * 1024);
	}
	
	public Docker(final String applicationName) {
		setApplicationName(applicationName);
		setMemoryUsed(16 * 1024);
	}
}
