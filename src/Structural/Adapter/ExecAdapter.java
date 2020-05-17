package Structural.Adapter;

public class ExecAdapter {

	public static void main(String[] args) {
		USBCCable cableUSB_C = new USBCCable();
		USBACable cableUSB_A = new USBACable();
		AdapterUSBCAToUSBAC adapterUSB_AToUSB_C = new AdapterUSBCAToUSBAC(cableUSB_A);
		USBCPort portUSB_C = new USBCPort();
		
		//Port USB-C accept cable USB-C
		portUSB_C.charge(cableUSB_C);
		
		//Port USB-C not accept cable USB-A
		//portUSB_C.charge(cableUSB_A);
		
		//Port USB-C accept cable USB-A using a adapter for USB-C
		portUSB_C.charge(adapterUSB_AToUSB_C);
	}
}
