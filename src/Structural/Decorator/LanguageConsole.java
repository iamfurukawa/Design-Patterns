package Structural.Decorator;

public class LanguageConsole extends LanguageConsoleDecorator {

	public LanguageConsole(IConsole console) {
		super(console);
	}

	@Override
	public void turnOn() {
		console.turnOn();
		System.out.println("Language: PT-BR.");
	}
}
