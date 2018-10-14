package com.tsquad.hackduke18.fixmymorning;

public class Task implements Comparable<Task>{
    private String name;
    private float upper;
    private float lower;
    private int priority;
    private String date;
    private float order;
    private int ID;

    public Task(int id, String Name, float Upper, float Lower, float ORDER, int PRIORITY, String DATE) {
        name = Name;
        upper = Upper;
        lower = Lower;
        order = ORDER;
        priority = PRIORITY;
        date = DATE;
        ID = id;

        Algorithm algo = new Algorithm();
    }

    public int getID() {return ID;}

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

    @Override
    public int compareTo(Task t){

        if(priority < t.getPriority())
            return -1;
        else if(priority == t.getPriority())
            return 0;

        return 1;
    }

}


