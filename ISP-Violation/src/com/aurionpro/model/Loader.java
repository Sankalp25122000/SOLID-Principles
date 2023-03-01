package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("Loader started work..");

	}

	@Override
	public void stop() {
		System.out.println("Loader stop doing work..");

	}

	@Override
	public void eat() {
		System.out.println("Loader is eating..");

	}

	@Override
	public void rest() {
		System.out.println("Loader is resting..");

	}

}
