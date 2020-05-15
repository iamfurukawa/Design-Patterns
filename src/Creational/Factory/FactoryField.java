package Creational.Factory;

public class FactoryField {

	public static IField createField(final FieldType fieldType) {
		switch (fieldType) {
			case TEXT: {
				return new TextField();
			}
			case FORMATTED: {
				return new FormattedField();
			}
			case PASSWORD: {
				return new PasswordField();
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + fieldType);
		}
	}
}
