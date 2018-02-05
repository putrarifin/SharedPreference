package code.chyrus.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //setuser
        PrefManager.getInstance().setUserInfo(new UserModel("1","putra","putra@gmail.com"));
        PrefManager.getInstance().setLogin(true);

        //getUser
        UserModel user = PrefManager.getInstance().getUser();

        Log.d(TAG, "username: "+user.getUsername());

        //untuk check session
        if (PrefManager.getInstance().isLoggedin()) {

            //gp to main

        } else {
            //login / intro welcome
        }

    }
}
