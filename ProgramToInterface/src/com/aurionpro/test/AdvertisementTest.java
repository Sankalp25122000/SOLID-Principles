package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.BillBoard;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement advObj = new Advertisement("Selling a bike",new BillBoard());
		advObj.showAdvertisement();
		
		Advertisement advObj2 = new Advertisement("Selling a Car",new Television());
		advObj2.showAdvertisement();
		
		Advertisement advObj3 = new Advertisement("Selling a house",new Projector());
		advObj3.showAdvertisement();
		
		advObj.setDisplay(new Television());
		advObj.showAdvertisement();

	}

}
