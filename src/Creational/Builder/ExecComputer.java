package Creational.Builder;

public class ExecComputer {
	public static void main(String[] args) {
		Computer.Builder computerBuilder = new Computer.Builder();

		computerBuilder.setBrand("Dell")
			.setDisk(1024)
			.setRam(16)
			.setGraphicCard("RTX")
			.setProcessor("i50 9999");
		
		Computer computer = computerBuilder.build();
		
		System.out.println(computer.toString());
	}
}
