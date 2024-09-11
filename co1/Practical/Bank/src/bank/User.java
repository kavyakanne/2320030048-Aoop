package bank;

public class User {
	private static User instance;
    private String username;
    private boolean loggedIn;

    private User() {
        this.loggedIn = false;
    }

    public static synchronized User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void login(String username) {
        if (!loggedIn) {
            this.username = username;
            this.loggedIn = true;
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println(username + " is already logged in.");
        }
    }

    public void logout() {
        if (loggedIn) {
            System.out.println(username + " logged out successfully.");
            this.username = null;
            this.loggedIn = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return username;
    }

}
