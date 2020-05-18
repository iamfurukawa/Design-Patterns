package Behavioral.ChainOfResponsability;

public class BiggerThanZero extends Validator {

	@Override
	public boolean check(int number) {
		if(number > 0)
			return true;
		return false;
	}
}
