package com.aurionpro.test;

import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.FestivalType1;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101,"Sankalp",2000,1,FestivalType1.DIWALI);
		System.out.println(fd);
		FixedDeposit fd1 = new FixedDeposit(102,"Sameer",2000,1,FestivalType1.HOLI);
		System.out.println(fd1);
		FixedDeposit fd3 = new FixedDeposit(103,"Sanskar",2000,1,FestivalType1.NEWYEAR);
		System.out.println(fd3);
		FixedDeposit fd4 = new FixedDeposit(104,"Mukesh",2000,1,FestivalType1.OTHERS);
		System.out.println(fd4);

	}

}
