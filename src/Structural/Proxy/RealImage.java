package Structural.Proxy;

public class RealImage implements IImage {

	private String fileName;

	public RealImage(final String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(final String fileName) {
		System.out.println("Loading " + fileName);
	}
}
