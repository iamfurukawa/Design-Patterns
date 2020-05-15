package Creational.AbstractFactory;

public class ExecAbstractFactory {

	public static void main(String[] args) {
		GUIFactory guiFactory = GUIFactory.getComponents(SystemType.WINDOWS);
		
		ISlider slider = guiFactory.createSlider();
		ILabel label = guiFactory.createLabel();
		
		slider.printActualValue();
		label.printLabel();
	}
}
