package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        this.userName="";
        this.password="";
    }

    public boolean setUserName(String name)
    {
        String check = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(check))
        {
            this.userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name)
    {
        String check = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[A-Za-z])(?=.*[A-Z0-9])(?=.*[a-z0-9])(?=.*[A-Za-z0-9])[A-Za-z0-9]{7,}$";
        if(name.matches(check))
        {
            this.password = name;
            return true;
        }
        return false;
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
