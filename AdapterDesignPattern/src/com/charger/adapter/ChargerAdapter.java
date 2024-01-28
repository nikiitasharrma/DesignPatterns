package com.charger.adapter;

import com.charger.AndroidCompany;
import com.charger.Apple;

/**
 * Adapter extends Apple but overrides the 
 * chargeIphone method with chargeAndroidPhone method
 */

public class ChargerAdapter implements Apple {
	
	AndroidCompany androidCharger;
	
	public ChargerAdapter(AndroidCompany androidCharger){
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargeIphone() {
		androidCharger.chargeAndroidPhone();
		System.out.println("Your iphone is charging with an android charger using adapter");
	}

}
