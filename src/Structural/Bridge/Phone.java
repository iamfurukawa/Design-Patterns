package Structural.Bridge;

public class Phone {
	
	private IPhone phone;
	private IColor color;

	public Phone(final IPhone phone, final IColor color) {
		this.phone = phone;
		this.color = color;
	}
	
	public void myPhone() {
		phone.makeCall();
		color.paint();
	}
}
