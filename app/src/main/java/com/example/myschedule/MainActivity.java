package com.example.myschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    private Button buttonMonday;
    private Button buttonTuesday;
    private Button buttonWednesday;
    private Button buttonThursday;
    private Button buttonFriday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMonday = findViewById(R.id.button_monday);
        buttonTuesday = findViewById(R.id.button_tuesday);
        buttonWednesday = findViewById(R.id.button_wednesday);
        buttonThursday = findViewById(R.id.button_thursday);
        buttonFriday = findViewById(R.id.button_friday);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] name = new String[]{};
                switch (view.getId()) {
                    case R.id.button_monday:
                        name = new String[]{"Матеша", "Матеша", "Матеша"};
                        break;
                    case R.id.button_tuesday:
                        name = new String[]{"Физика", "Физика", "Инфа", "Инфа"};
                        break;
                    case R.id.button_wednesday:
                        name = new String[]{"Русский", "Литра", "История"};
                        break;
                    case R.id.button_thursday:
                        name = new String[]{"Физика", "Физика", "Инфа", "Инфа"};
                        break;
                    case R.id.button_friday:
                        name = new String[]{"Физра", "Физра"};
                        break;
                }
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("data", name);
                startActivity(intent);
            }
        };

        buttonMonday.setOnClickListener(listener);
        buttonTuesday.setOnClickListener(listener);
        buttonWednesday.setOnClickListener(listener);
        buttonThursday.setOnClickListener(listener);
        buttonFriday.setOnClickListener(listener);
    }
}