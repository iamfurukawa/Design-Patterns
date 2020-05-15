package Creational.Prototype;

public class Movie implements Cloneable {

	private String title;
	private int duration;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", duration=" + duration + "]";
	}
}
