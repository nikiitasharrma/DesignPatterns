package com.observer.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.observer.Subscriber;
import com.observer.youtube.YoutubeChannel;

/**
 * Observer design pattern is a behavioral design pattern 
 * in which when subject changes it's state, all it's 
 * dependent objects are notified of the change
 * Establishes a one to many relationship
 */

public class Client {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		YoutubeChannel channel = new YoutubeChannel();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload a new video");
			System.out.println("Press 2 to subscribe to the channel");
			System.out.println("Press 3 to exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//uploading new video
				System.out.println("Enter title for the new video");
				String title = br.readLine();
				channel.newVideoUploaded(title);
			}
			else if(c == 2) {
				//subscribing to the channel
				System.out.println("Enter name of the subscriber");
				String name = br.readLine();
				Subscriber subsName = new Subscriber(name);
				channel.subscribe(subsName);
			}
			else if(c == 3) {
				//exiting 
				System.out.println("Thankyou for interacting!");
				break;
			}
			else {
				//wrong input
				System.out.println("Wrong input");
			}
		}
	}
}
