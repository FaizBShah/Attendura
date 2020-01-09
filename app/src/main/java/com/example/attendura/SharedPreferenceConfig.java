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
}
