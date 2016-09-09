package cpe200;

import sun.security.util.Password;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {

    }

    public boolean setUserName(String name)
    {
        String regex = "^([A-Za-z])([A-Za-z0-9]){7,}$";
        if(name.matches(regex)){
            userName = name;
            return true;
        }else {
            return false;
        }
    }

    public boolean setPassword(String name)
    {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]){12,}$";
        if(name.matches(regex)){
            password = name;
            return true;
        }else {
            return false;
        }
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
