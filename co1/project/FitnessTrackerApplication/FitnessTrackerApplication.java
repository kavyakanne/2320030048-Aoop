package com.fitness.model;

public class Goal {
	 private String description;
	    private double target; 
	    private boolean achieved;

	    public Goal(String description, double target) {
	        this.description = description;
	        this.target = target;
	        this.achieved = false;
	    }


	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public double getTarget() {
	        return target;
	    }

	    public void setTarget(double target) {
	        this.target = target;
	    }

	    public boolean isAchieved() {
	        return achieved;
	    }

	    public void setAchieved(boolean achieved) {
	        this.achieved = achieved;
	    }

}
