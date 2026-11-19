package com.tap.SpringCore;

public class CargoPlane extends Plane {
	
	private String engine;
	private int speed;
	
	
	public CargoPlane() {
		super();
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	

	@Override
	public String toString() {
		return "CargoPlane [engine=" + engine + ", speed=" + speed + "]";
	}


	public CargoPlane(String engine, int speed) {
		super();
		this.engine = engine;
		this.speed = speed;
	}


	void takeOff() {
		System.out.println("CargoPlane is TakingOff");
		}
	
	
	void fly() {
		System.out.println("CargoPlane is Flying");
	}
	
	
	void land() {
		System.out.println("CargoPlane is Landing");
	}
}
