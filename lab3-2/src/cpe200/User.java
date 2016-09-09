package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected final String USERNAME_PATTERN = "[A-Za-z][A-Za-z0-9]{7,}";
    protected final String PASSWORD_PATTERN = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{12}";

    protected String username;
    protected String password;

    protected Pattern usernamePattern;
    protected Pattern passwordPattern;

    public User()
    {
        usernamePattern = Pattern.compile(USERNAME_PATTERN);
        passwordPattern = Pattern.compile(PASSWORD_PATTERN);
    }

    public boolean setUserName(String username)
    {
        Matcher m = usernamePattern.matcher(username);
        if (m.find()) {
            this.username = username;
            return true;
        }
        return false;
    }

    public boolean setPassword(String password)
    {
        Matcher m = passwordPattern.matcher(password);
        if (m.find()) {
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
