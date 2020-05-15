package Creational.Prototype;

public class MusicalMovie extends Movie {

	private int musics;

	public int getMusics() {
		return musics;
	}

	public void setMusics(int musics) {
		this.musics = musics;
	}

	@Override
	public String toString() {
		return "MusicalMovie [musics=" + musics + "] " + super.toString();
	}
}
