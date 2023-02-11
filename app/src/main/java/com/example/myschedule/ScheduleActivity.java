package com.example.myschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ScheduleActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        String[] name = getIntent().getExtras().getStringArray("data");
        SubjectAdapter subjectAdapter = new SubjectAdapter(this, createSubjects(name));

        listView = findViewById(R.id.list_view);
        listView.setAdapter(subjectAdapter);
    }

    Subject[] createSubjects(String[] name){
        Subject[] subjects = new Subject[name.length];
        String[] time = {"8:30-9:15","9:30-10:15","10:30-11:15","11:30-12:15", "12:30-13:15"};

        for (int i = 0; i < name.length; i++){
            Subject subject = new Subject(name[i], time[i]);
            subjects[i] = subject;
        }
        return subjects;
    }
}