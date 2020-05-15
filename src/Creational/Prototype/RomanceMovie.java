package Creational.Prototype;

public class RomanceMovie extends Movie {

	private int couples;

	public int getCouples() {
		return couples;
	}

	public void setCouples(int couples) {
		this.couples = couples;
	}

	@Override
	public String toString() {
		return "RomanceMovie [couples=" + couples + "] " + super.toString();
	}
}
