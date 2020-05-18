package Behavioral.ChainOfResponsability;

public class Even extends Validator {

	@Override
	public boolean check(int number) {
		if(number % 2 == 0)
			return true;
		return false;
	}
}
