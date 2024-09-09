package com.fitness.main;

import com.fitness.model.Activity;
import com.fitness.model.Goal;
import com.fitness.model.User;
import com.fitness.service.ActivityTracker;
import com.fitness.service.UserProgressReport;
import java.util.Scanner;

public class FitnessTrackerApp {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.println("Enter your age: ");
	        int age = scanner.nextInt();
	        
	        System.out.println("Enter your weight (kg): ");
	        double weight = scanner.nextDouble();
	        
	        System.out.println("Enter your height (cm): ");
	        double height = scanner.nextDouble();
	        
	        User user = new User(name, age, weight, height);
	        ActivityTracker tracker = new ActivityTracker();

	        System.out.println("Set your goal (distance in km): ");
	        double targetDistance = scanner.nextDouble();
	        scanner.nextLine(); 
	        
	        System.out.println("Describe your goal: ");
	        String goalDescription = scanner.nextLine();
	        Goal goal = new Goal(goalDescription, targetDistance);

	        String addMore;
	        do {
	            System.out.println("Add an activity (e.g., Running, Walking): ");
	            String type = scanner.nextLine();
	            
	            System.out.println("Duration (in minutes): ");
	            double duration = scanner.nextDouble();
	            
	            System.out.println("Distance (in km): ");
	            double distance = scanner.nextDouble();
	            scanner.nextLine();  // consume newline

	            Activity activity = new Activity(type, duration, distance);
	            tracker.addActivity(activity);

	            System.out.println("Do you want to add another activity? (yes/no): ");
	            addMore = scanner.nextLine();
	        } while (addMore.equalsIgnoreCase("yes"));

	        tracker.updateGoalStatus(goal);

	        UserProgressReport report = new UserProgressReport();
	        report.generateReport(user, tracker, goal);

	        scanner.close();
	    }

}
