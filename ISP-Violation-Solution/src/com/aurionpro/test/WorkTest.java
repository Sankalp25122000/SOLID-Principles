package com.aurionpro.test;

import com.aurionpro.model.IWorkable;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Loader;
import com.aurionpro.model.Robot;

public class WorkTest {

	public static void main(String[] args) {
		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
		System.out.println();

		IWorker loader = new Loader();
		loader.start();
		loader.stop();
		loader.eat();
		loader.rest();

	}

}
