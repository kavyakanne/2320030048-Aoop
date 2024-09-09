package com.fitness.service;

import com.fitness.model.Activity;
import com.fitness.model.Goal;
import com.fitness.model.User;

public class UserProgressReport {
	   public void generateReport(User user, ActivityTracker tracker, Goal goal) {
	        System.out.println("Progress Report for: " + user.getName());
	        System.out.println("Age: " + user.getAge());
	        System.out.println("Weight: " + user.getWeight() + " kg");
	        System.out.println("Height: " + user.getHeight() + " cm");
	        System.out.println("\nActivities:");
	        
	        for (Activity activity : tracker.getActivities()) {
	            System.out.println("Type: " + activity.getType() +
	                               ", Duration: " + activity.getDuration() + " min" +
	                               ", Distance: " + activity.getDistance() + " km");
	        }

	        System.out.println("\nTotal Distance: " + tracker.totalDistance() + " km");
	        System.out.println("Goal: " + goal.getDescription());
	        System.out.println("Target Distance: " + goal.getTarget() + " km");
	        System.out.println("Goal Achieved: " + (goal.isAchieved() ? "Yes" : "No"));
	    }

}
