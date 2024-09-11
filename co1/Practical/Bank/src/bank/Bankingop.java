package bank;

public class Bankingop {
	public void viewBalance() {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Balance for user " + session.getUsername() + ": $1000");
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Deposited $" + amount + " to " + session.getUsername() + "'s account.");
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Withdrew $" + amount + " from " + session.getUsername() + "'s account.");
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }

}
