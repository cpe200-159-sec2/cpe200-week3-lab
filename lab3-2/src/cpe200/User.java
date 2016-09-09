package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User() {
        /* your code here */
    }

    public boolean setUserName(String name) {
        /* your code here */
        String pattern = "^([A-Za-z])([A-Za-z0-9]{7,})$";
        if (name.matches(pattern)) {
            userName = name;
            return true;
        } else return false;
    }

    public boolean setPassword(String name) {
        /* your code here */
        String pass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})$";
        if (name.matches(pass)) {
            password = name;
            return true;
        } else return false;
    }

    public String getUserName() {
        /* your code here */
        return userName;
    }

    public String getPassword() {
        /* your code here */
        return password;
    }
}
