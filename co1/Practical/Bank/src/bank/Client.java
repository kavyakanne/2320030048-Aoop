package bank;

public class Client {
	 public static void main(String[] args) {
	      
	        User session = User.getInstance();
	        session.login("kavya");

	        Bankingop bankingOperations = new Bankingop();
	        bankingOperations.viewBalance();
	        bankingOperations.deposit(500);
	        bankingOperations.withdraw(200);

	        session.login("kavya");

	        session.logout();
	        bankingOperations.viewBalance();
	    }

}
