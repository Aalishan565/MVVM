package ayesha.mvvm.model;

public class User {
    public String userName;
    public String userPassword;
    public String userNameHint;
    public String userPasswordHint;

    public User(String userNameHint, String userPasswordHint) {
        this.userNameHint = userNameHint;
        this.userPasswordHint = userPasswordHint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;

    }

    public String getUserNameHint() {
        return userNameHint;
    }

    public void setUserNameHint(String userNameHint) {
        this.userNameHint = userNameHint;
    }

    public String getUserPasswordHint() {
        return userPasswordHint;
    }

    public void setUserPasswordHint(String userPasswordHint) {
        this.userPasswordHint = userPasswordHint;
    }
}
