package com.tsquad.hackduke18.fixmymorning;

public class Algorithm {

	private double endtime;
	private String dayofweek;

	public Algorithm() {


	}

	public Task[] executeSelection(Task[] data, double duration) {
		Task[] tasks = new Task[data.length];
		tasks = data;

		List<Task> nonnegs = new ArrayList<>;
		for Task t : tasks
			if (t.getPriority()==6)
				nonnegs.add(t);

		double sumLower = 0;
		for Task t : nonnegs
			sumLower += t.getLower();

		if (sumLower>duration){
			System.out.println("Error: Umm, there is not enough time to do everything you must. Try going back to sleep, tomorrow's always a new day.");
			System.exit(0);
		}

		
		
	}

}