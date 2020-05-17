package Structural.Decorator;

public abstract class LanguageConsoleDecorator implements IConsole {
	
	protected IConsole console;

	public LanguageConsoleDecorator(final IConsole console) {
		this.console = console;
	}
	
	@Override
	public void turnOn() {
		console.turnOn();
	}
}
