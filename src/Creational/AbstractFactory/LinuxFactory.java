package Creational.AbstractFactory;

public class LinuxFactory extends GUIFactory {

	@Override
	public ILabel createLabel() {
		return new LinuxLabel();
	}

	@Override
	public ISlider createSlider() {
		return new LinuxSlider();
	}
}
