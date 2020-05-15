package Creational.Factory;

public class ExecFactory {
	public static void main(String[] args) {
		IField field = FactoryField.createField(FieldType.PASSWORD);
		field.onChange(123);
	}
}
