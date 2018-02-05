package code.chyrus.sharedpreference;

import android.content.SharedPreferences;

/**
 * Created by chyrus on 2/5/18.
 */

public class PrefManager {

    private static SharedPreferences prefInstance;

    public static PrefManager getInstance() {
        prefInstance = MyApp.getInstance().getSharedPreference();
        return new PrefManager();
    }

    public void setUserInfo(UserModel user) {
        SharedPreferences.Editor editor = prefInstance.edit();
        editor.putString(Constans.PREF_USERID_KEY,user.getUserID());
        editor.putString(Constans.PREF_USERNAME_KEY,user.getUsername());
        editor.putString(Constans.PREF_EMAIL_KEY,user.getEmail());
        editor.apply();
    }

    public UserModel getUser() {
        UserModel user = new UserModel(
                prefInstance.getString(Constans.PREF_USERID_KEY,"")
        ,prefInstance.getString(Constans.PREF_USERNAME_KEY,"")
        ,prefInstance.getString(Constans.PREF_EMAIL_KEY,""));
        return user;
    }

    public void setLogin(boolean status) {
        SharedPreferences.Editor editor = prefInstance.edit();
        editor.putBoolean(Constans.PREF_SESSIONLOGIN_KEY, status);
        editor.apply();
    }

    public boolean isLoggedin(){
        return prefInstance.getBoolean(Constans.PREF_SESSIONLOGIN_KEY,false);
    }

}
