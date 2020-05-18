package Behavioral.ChainOfResponsability;

public class ExecChanOfResponsability {

	public static void main(String[] args) {
		Validator validator = new Even();
		validator.linkWith(new Two())
				 .linkWith(new BiggerThanZero());
		
		Server server = new Server(validator);
		
		if(server.validateNumber(2)) {
			System.out.println("Valid!");
		} else {
			System.out.println("Invalid!");
		}
	}
}
