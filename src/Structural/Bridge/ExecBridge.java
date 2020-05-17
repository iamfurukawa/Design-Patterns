package Structural.Bridge;

public class ExecBridge {
	
	public static void main(String[] args) {
		Phone myPhone = new Phone(new Apple(), new Red());
		myPhone.myPhone();
	}
}
