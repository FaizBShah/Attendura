package com.example.attendura;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.change_inputs_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.change_menu_item:
                Intent intent = new Intent(this,Activity_voice.class);
                preferenceConfig.writeLogInStatus(false);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
