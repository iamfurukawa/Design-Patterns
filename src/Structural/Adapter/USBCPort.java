package Structural.Adapter;

public class USBCPort {
	
	public void charge(final USBCCable usbcCable) {
		usbcCable.connect();
	}
}
