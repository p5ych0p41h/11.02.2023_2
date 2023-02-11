package com.example.myschedule;

public class Subject {
    private String name;
    private String time;

    public Subject(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
}