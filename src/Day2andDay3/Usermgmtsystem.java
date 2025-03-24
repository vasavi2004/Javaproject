package Day2andDay3;

	class User {
	    private String username;
	    private String password;
	    public User(String username, String password) {
	        this.username = username;
	        setPassword(password); 
	    }
	    public String getUsername() {
	        return username;
	    }
	    public void setPassword(String password) {
	        if (password.length() >= 8) {
	            this.password = password;
	            System.out.println("Password set successfully.");
	        } else {
	            System.out.println("Error: Password must be at least 8 characters long.");
	        }
	    }
	}

	public class Usermgmtsystem {
	    public static void main(String[] args) {
	        User user1 = new User("john_doe", "pass123"); 
	        User user2 = new User("alice", "securePass1"); 
	        
	        System.out.println("Username: " + user2.getUsername());
	    }
	}
