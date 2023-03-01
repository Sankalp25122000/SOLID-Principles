package com.aurionpro.test;

import com.aurionpro.model.DiwaliInterest;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.HoliInterest;
import com.aurionpro.model.NewYearInterest;
import com.aurionpro.model.OtherInterest;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101,"Ajay",1000,2,new DiwaliInterest());
		System.out.println(fd);
		FixedDeposit fd1 = new FixedDeposit(102,"Sankalp",1000,2,new HoliInterest());
		System.out.println(fd1);
		FixedDeposit fd2 = new FixedDeposit(103,"Sameer",1000,2,new NewYearInterest());
		System.out.println(fd2);
		FixedDeposit fd3 = new FixedDeposit(104,"Jayesh",1000,2,new OtherInterest());
		System.out.println(fd3);
		fd3.setInterest(new DiwaliInterest());
		System.out.println(fd3);

	}

}
