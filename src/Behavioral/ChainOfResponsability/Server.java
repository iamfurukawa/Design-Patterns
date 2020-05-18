package Behavioral.ChainOfResponsability;

public class Server {
	
	private Validator validator;

	public Server(final Validator validator) {
		this.validator = validator;
	}
	
	public boolean validateNumber(final int number) {
		if (validator.check(number))
			return true;
		return false;
	}
}
