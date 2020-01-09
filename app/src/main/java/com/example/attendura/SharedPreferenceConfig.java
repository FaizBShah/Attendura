package com.example.attendura;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {

    private SharedPreferences sharedPreferences;
    private Context context;

    public SharedPreferenceConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preference), Context.MODE_PRIVATE);
    }

    public SharedPreferenceConfig()
    {
    }

    public void writeLogInStatus(boolean status)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status),status);
        editor.commit();
    }

    public boolean readLogInStatus()
    {
        boolean status = false;
        status=sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status),false);
        return status;
    }

    public void writeRoll(int FirstRoll,int LastRoll)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(context.getResources().getString(R.string.login_first_roll),FirstRoll);
        editor.putInt(context.getResources().getString(R.string.login_last_roll),LastRoll);
        editor.commit();
    }

    public int readFirstRoll()
    {
        int first_roll = sharedPreferences.getInt(context.getResources().getString(R.string.login_first_roll),0);
        return first_roll;
    }

    public int readLastRoll()
    {
        int last_roll = sharedPreferences.getInt(context.getResources().getString(R.string.login_last_roll),100);
        return last_roll;
    }

}
