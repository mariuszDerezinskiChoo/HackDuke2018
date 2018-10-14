package com.tsquad.hackduke18.fixmymorning;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    private double endtime;
    private String dayofweek;

    public Algorithm() {


    }

    public List<Task> executeSelection(Task[] data, double duration) {
        Task[] tasks = new Task[data.length];
        tasks = data;

        List<Task> negs = new ArrayList<>();
        List<Task> nonnegs = new ArrayList<>();

        List<Task> finalUnorderedTasks = new ArrayList<>();
        for (Task t : tasks)
            if (t.getPriority() == 6)
                nonnegs.add(t);
            else
                negs.add(t);

        double sumNNSLower = 0;
        for (Task t : nonnegs)
            sumNNSLower += t.getLower();

        if (sumNNSLower > duration) {
            System.out.println("Error: Umm, there is not enough time to do everything you must. Try going back to sleep, tomorrow's always a new day.");
            System.exit(0);
        }

        finalUnorderedTasks.addAll(nonnegs);

        double sumNSLower = 0;
        for (Task t : negs)
            sumNSLower += t.getLower();
        if (sumNSLower <= (duration - sumNNSLower)) {
            finalUnorderedTasks.addAll(negs);
            return finalUnorderedTasks;
        }

        return finalUnorderedTasks;

    }

}