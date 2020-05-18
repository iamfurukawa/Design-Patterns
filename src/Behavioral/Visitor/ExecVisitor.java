package Behavioral.Visitor;

public class ExecVisitor {
	
	public static void main(String[] args) {

		IComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}