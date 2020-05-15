package Creational.Prototype;

public class HorrorMovie extends Movie {

	private int scareScenes;
	private Character character;
	
	public HorrorMovie() {
		this.character = new Character();
		this.character.setName("Emma Water");
	}

	public int getScareScenes() {
		return scareScenes;
	}

	public void setScareScenes(int scareScenes) {
		this.scareScenes = scareScenes;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "HorrorMovie [scareScenes=" + scareScenes + "] " + super.toString() + " " + character.toString();
	}
}
