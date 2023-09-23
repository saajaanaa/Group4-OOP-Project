package JavaOopsProject;
/**
 * Create Registration Class in which you would have variables as email, userName and password that have
an access scope only within its own class. After creating an object of the class user should be able to
call methods and in each method separately pass values to set users email, username and password.
 Requirements:
 A. Valid email consider to be only yahoo
 B. Valid userName and password cannot be empty and should be of
 length larger than 6 characters. Also, valid password cannot contain
 userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(){}

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        }else {
            System.out.println("Not a valid email address");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username");
        }
    }

    public void setPassword(String password) {
        if (password.contains(userName) || password.isEmpty() || password.length() < 6){
            System.out.println("invalid password");
        }else {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void displayUser(){
        System.out.println("Email: " + getEmail());
        System.out.println("Username: " + getUserName());
        System.out.println("Password: " + getPassword());
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("sajana.shrestha@yahoo.com");
        registration.setUserName("sajanashrestha");
        registration.setPassword("Password1");

        registration.displayUser();
    }
}

