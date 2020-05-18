package Behavioral.ChainOfResponsability;

public class Two extends Validator{

	@Override
	public boolean check(int number) {
		if(number == 2)
			return true;
		return false;
	}
}
