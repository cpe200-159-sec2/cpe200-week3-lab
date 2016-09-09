package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        userName = new String();
        password = new String();
    }

    public boolean setUserName(String name)
    {
        String temp = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(temp)){
            userName = name;
            return true;
        }else return false;
    }

    public boolean setPassword(String name)
    {
        String temp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{12,}";
        if(name.matches(temp)){
            password = name;
            return true;
        }else return false;

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
