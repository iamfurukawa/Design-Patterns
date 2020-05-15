package Creational.AbstractFactory;

public abstract class GUIFactory {

	public static GUIFactory getComponents(final SystemType systemType) {
		
		switch (systemType) {
			case WINDOWS: {
				return new WindowsFactory();
			}
			case LINUX: {
				return new LinuxFactory();
			}
			default:
				return null;
		}
	}
	
	public abstract ILabel createLabel();
	
	public abstract ISlider createSlider();
}
