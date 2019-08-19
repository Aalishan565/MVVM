package ayesha.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import ayesha.mvvm.commands.UserLogin;
import ayesha.mvvm.databinding.ActivityMainBinding;
import ayesha.mvvm.model.User;
import ayesha.mvvm.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel(new User("UserName", "Password"));
        activityMainBinding.setUserModel(userModel);
        activityMainBinding.setLogin(new UserLogin() {
            @Override
            public void onLogin() {
                Toast.makeText(MainActivity.this, "" + activityMainBinding.getUserModel().getUserName(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
