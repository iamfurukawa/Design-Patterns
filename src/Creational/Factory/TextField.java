package Creational.Factory;

public class TextField implements IField {

	private String text;

	@Override
	public void setText(final String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void onChange(int event) {
		System.out.println("The Text Field was changed by event: " + event);
	}
}
