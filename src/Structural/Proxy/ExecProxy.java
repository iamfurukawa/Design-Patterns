package Structural.Proxy;

public class ExecProxy {

	public static void main(String[] args) {

		ProxyImage image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
