package com.example.dwinkelman.hackduke2018_daniel;

public class Task {
    private int id;
    private String name;
    private float upper;
    private float lower;
    private int priority;
    private String date;
    private float order;

    public Task(int id, String name, float Upper, float Lower, float ORDER, int PRIORITY, String DATE) {
        this.name = name;
        this.upper = Upper;
        this.lower = Lower;
        this.order = ORDER;
        this.priority = PRIORITY;
        this.date = DATE;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getUpper() {
        return upper;
    }

    public float getLower() {
        return lower;
    }

    public float getOrder() {
        return order;
    }

    public int getPriority() {
        return priority;
    }

    public String getDate() {
        return date;
    }

}


