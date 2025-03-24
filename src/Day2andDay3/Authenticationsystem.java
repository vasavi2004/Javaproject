package Day2andDay3;
class Authenticationsystem {
	    private String correctPassword = "admin123";
	    private class Validator {
	        private boolean validate(String password) {
	            return correctPassword.equals(password);
	        }
	    }
	    
	    public void login(String password) {
	        Validator validator = new Validator();
	        if (validator.validate(password)) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Incorrect Password");
	        }
	    }
	    
	    public static void main(String[] args) {
	        Authenticationsystem auth = new Authenticationsystem();
	        auth.login("admin123"); 
	        auth.login("wrongPass"); 
	    }
	}

