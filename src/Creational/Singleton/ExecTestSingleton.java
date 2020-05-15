package Creational.Singleton;

public class ExecTestSingleton {

	public static void main(String[] args) {
		Thread threadFoo = new Thread(new ThreadOne());
		Thread threadBar = new Thread(new ThreadTwo());
		threadFoo.start();
		threadBar.start();
	}

	static class ThreadOne implements Runnable {
		@Override
		public void run() {
			TestSingleton singleton = TestSingleton.getInstance("One");
			System.out.println(singleton.value);
		}
	}

	static class ThreadTwo implements Runnable {
		@Override
		public void run() {
			TestSingleton singleton = TestSingleton.getInstance("Two");
			System.out.println(singleton.value);
		}
	}

}
