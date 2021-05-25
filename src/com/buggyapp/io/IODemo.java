package com.buggyapp.io;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Ram Lakshmanan
 */
public class IODemo {

	public void start() {
		
		for (int counter =1; counter <= 5; ++counter) {

			// Launch 5 threads.
			new IOThread ("fileIO-" + counter + ".txt").start();
			System.out.println("Starting to write to fileIO-" + counter + ".txt");
		}
	}
	
	public static void stop() {
		
		System.out.println("Heavy IO activity terminated!");
	}
}
