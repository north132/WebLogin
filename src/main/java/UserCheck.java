public class UserCheck {
    private String validUsername;
    private String validPassword;

    UserCheck()
    {
        validUsername = "user";
        validPassword = "password";
    }

    public boolean isValidUser(String name,String password){
        if(validUsername.equals(name) && validPassword.equals(password))
        {
            return true;
        }
        return false;
    }
}
