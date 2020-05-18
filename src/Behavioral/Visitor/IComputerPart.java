package Behavioral.Visitor;

public interface IComputerPart {
	
	public void accept(IComputerPartVisitor computerPartVisitor);
}