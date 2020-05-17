package Structural.Decorator;

public class ExecDecorator {

	public static void main(String[] args) {
		IConsole console = new LanguageConsole(new NintendoSwitch());
		console.turnOn();
	}
}
