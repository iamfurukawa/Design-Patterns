package Creational.Factory;

public class PasswordField implements IField {

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
		System.out.println("The Password Field was changed by event: " + event);
	}
}
