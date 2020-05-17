package Structural.Bridge;

public class Google implements IPhone {

	@Override
	public void makeCall() {
		System.out.println("Calling from pixel.");
	}
}
