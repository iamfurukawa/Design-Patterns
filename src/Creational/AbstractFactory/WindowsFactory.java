package Creational.AbstractFactory;

public class WindowsFactory extends GUIFactory {

	@Override
	public ILabel createLabel() {
		return new WindowsLabel();
	}

	@Override
	public ISlider createSlider() {
		return new WindowsSlider();
	}
}
