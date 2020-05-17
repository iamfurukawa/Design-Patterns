package Structural.Bridge;

public class Apple implements IPhone {

	@Override
	public void makeCall() {
		System.out.println("Calling from Iphone.");
	}
}
