package Behavioral.Visitor;

public class Monitor implements IComputerPart {

	@Override
	public void accept(IComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}