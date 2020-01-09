package com.example.attendura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Take_Activity extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;
    private TextView Display_First_Roll,Display_Last_Roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_);

        Display_First_Roll = findViewById(R.id.textView);
        Display_Last_Roll = findViewById(R.id.textView2);

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());

        int first_roll = preferenceConfig.readFirstRoll();
        int last_roll = preferenceConfig.readLastRoll();

        Display_First_Roll.setText(String.valueOf(first_roll));
        Display_Last_Roll.setText(String.valueOf(last_roll));
    }

    public void Reset_Change(View view)
    {
        preferenceConfig.writeLogInStatus(false);
        startActivity(new Intent(this,Activity_voice.class));
    }
}
