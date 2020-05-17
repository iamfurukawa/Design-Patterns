package Structural.Adapter;

public class AdapterUSBCAToUSBAC extends USBCCable {
	
	private USBACable usbaCable;
	
	public AdapterUSBCAToUSBAC(final USBACable usbaCable) {
		this.usbaCable = usbaCable;
	}
	
	@Override
	public void connect() {
		usbaCable.print();//Do something to adapt USB-A to USB-C, like parse connections.
		System.out.println("Connecting using Adapter for USB-C to USB-A.");
	}
}
