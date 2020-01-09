package com.example.attendura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Take_Activity extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_);

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
    }

    public void Reset_Change(View view)
    {
        preferenceConfig.writeLogInStatus(false);
        startActivity(new Intent(this,Activity_voice.class));
    }
}
