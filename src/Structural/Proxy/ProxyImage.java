package Structural.Proxy;

public class ProxyImage implements IImage {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(final String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}