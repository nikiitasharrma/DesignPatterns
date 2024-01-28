package com.observer.youtube;

import com.observer.Observer;

public interface Subject {
	
	void subscribe(Observer ob);
	
	void newVideoUploaded(String title);
}
