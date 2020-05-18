package Behavioral.Visitor;

public class Keyboard implements IComputerPart {

	@Override
	public void accept(IComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}