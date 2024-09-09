package com.fitness.service;

import com.fitness.model.Activity;
import com.fitness.model.Goal;

import java.util.ArrayList;
import java.util.List;

public class ActivityTracker {
	  private List<Activity> activities;

	    public ActivityTracker() {
	        activities = new ArrayList<>();
	    }

	    public void addActivity(Activity activity) {
	        activities.add(activity);
	    }

	    public double totalDistance() {
	        return activities.stream().mapToDouble(Activity::getDistance).sum();
	    }

	    public boolean checkGoal(Goal goal) {
	        return totalDistance() >= goal.getTarget();
	    }

	    public void updateGoalStatus(Goal goal) {
	        if (checkGoal(goal)) {
	            goal.setAchieved(true);
	        }
	    }

	    public List<Activity> getActivities() {
	        return activities;
	    }

}
