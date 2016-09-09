package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        /* your code here */
        this.userName ="";
        this.password = "";
    }

    public boolean setUserName(String name)
    {

        /* your code here */
        String temp = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(temp)){
            this.userName = name;
            return  true;
        } else
            return false;

    }

    public boolean setPassword(String name)
    {
        /* your code here */
        String temp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{12,}";

        if(name.matches(temp)){
            this.password = name;
            return true;
        } else
            return false;
    }

    public String getUserName()
    {
        /* your code here */

        return userName;
    }

    public String getPassword()
    {
        /* your code here */
        return password;
    }
}
