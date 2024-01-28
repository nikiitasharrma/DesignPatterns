package com.observer.youtube;

import java.util.ArrayList;
import java.util.List;

import com.observer.Observer;

public class YoutubeChannel implements Subject{
	
	List<Observer> subscriber = new ArrayList<>();
	
	@Override
	public void subscribe(Observer ob) {
		subscriber.add(ob);
	}

	@Override
	public void newVideoUploaded(String title) {
		
		for(Observer ob : this.subscriber) {
			ob.notified(title);
		}
	}

}
