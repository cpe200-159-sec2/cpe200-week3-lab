package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {

    protected static final String USERNAME_PATTERN = "^[A-Za-z][A-Za-z0-9]{7,}$";
    protected static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$";

    protected String username;
    protected String password;

    public User()
    {

    }

    public boolean setUserName(String username)
    {
        if (username.matches(USERNAME_PATTERN)) {
            this.username = username;
            return true;
        }
        return false;
    }

    public boolean setPassword(String password)
    {
        if (password.matches(PASSWORD_PATTERN)) {
            this.password = password;
            return true;
        }
        return false;
    }

    public String getUserName()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }
}
