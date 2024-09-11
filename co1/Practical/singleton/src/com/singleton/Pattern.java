package com.singleton;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();

        logger.log("Starting the application.");
        logger.log("Performing some operations...");
        logger.log("Application finished.");
        
        Logger anotherLogger = Logger.getInstance();
        
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances exist.");
        }
	}

}
