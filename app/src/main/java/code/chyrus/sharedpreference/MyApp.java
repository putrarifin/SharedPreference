package code.chyrus.sharedpreference;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by chyrus on 2/5/18.
 */

public class MyApp extends Application {

    private static MyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized MyApp getInstance(){
        return instance;
    }

    public  SharedPreferences getSharedPreference() {
        return getSharedPreferences(Constans.PREF_NAME,MODE_PRIVATE);
    }

}
