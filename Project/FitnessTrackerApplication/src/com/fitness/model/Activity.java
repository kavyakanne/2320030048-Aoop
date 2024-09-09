package com.fitness.model;

public class Activity {
	private String type;
    private double duration; 
    private double distance; 

    public Activity(String type, double duration, double distance) {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

}
