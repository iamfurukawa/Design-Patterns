package Behavioral.ChainOfResponsability;

public abstract class Validator {

	private Validator next;

	public abstract boolean check(final int number);

	public Validator linkWith(final Validator validator) {
		this.next = validator;
		return this;
	}

	protected boolean checkNext(final int number) {
		if (next == null) {
			return true;
		}
		return next.check(number);
	}
}
