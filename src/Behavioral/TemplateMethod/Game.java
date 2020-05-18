package Behavioral.TemplateMethod;

public abstract class Game {
	
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();
	
	private void setup() {
		System.out.println("Welcome to the game!");
	}

	// template method
	public final void play() {
		
		// generic setup
		setup();

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}