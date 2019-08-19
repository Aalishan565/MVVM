package ayesha.mvvm.viewmodel;

import android.databinding.BaseObservable;

import ayesha.mvvm.R;
import ayesha.mvvm.model.User;

public class UserModel extends BaseObservable {
    public String userName;
    public String userPassword;
    public String userNameHint;
    public String userPasswordHint;

    public UserModel(User user) {
        this.userNameHint = user.userNameHint;
        this.userPasswordHint = user.userPasswordHint;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(R.id.etUserName);
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        notifyPropertyChanged(R.id.etPassword);
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
