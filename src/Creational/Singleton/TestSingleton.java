package Creational.Singleton;

public final class TestSingleton {

	private static volatile TestSingleton instance;

	public String value;

	private TestSingleton(String value) {
		this.value = value;
	}

	public static TestSingleton getInstance(String value) {
		if (instance == null) {
			synchronized (TestSingleton.class) {
				if (instance == null) {
					instance = new TestSingleton(value);
				}
				return instance;
			}
		}
		return instance;
	}
}