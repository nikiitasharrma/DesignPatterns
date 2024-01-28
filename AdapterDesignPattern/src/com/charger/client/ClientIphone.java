package com.charger.client;

import com.charger.adapter.ChargerAdapter;
import com.charger.charge.AndroidCharger;
import com.charger.iphone.Iphone;
import com.charger.Apple;

/**
 * Adapter Design Pattern is a structural pattern that 
 * allows incompatible interfaces to work together. 
 * It allows us to access objects of incompatible 
 * interfaces using an adapter.
 * In this example, We don't have an Iphone charger 
 * and we are charging an Iphone with an android charger 
 * using an adapter.
 */

public class ClientIphone {
	
	public static void main(String[] args) {
		
		AndroidCharger androidCharger = new AndroidCharger();
		
		Apple adapter = new ChargerAdapter(androidCharger);

		Iphone iphone = new Iphone(adapter);
		
		iphone.chargerIphone();
	}
	
}
