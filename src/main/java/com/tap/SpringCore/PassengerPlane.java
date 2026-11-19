package com.tap.SpringCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pp")
public class PassengerPlane extends Plane {
	
	@Value("Turbo")
	private String engine;
	@Value("1500")
	private int speed;
	
	
	
	@Override
	public String toString() {
		return "PassengerPlane [engine=" + engine + ", speed=" + speed + "]";
	}


	public PassengerPlane() {
		super();
	}


	public PassengerPlane(String engine, int speed) {
		super();
		this.engine = engine;
		this.speed = speed;
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


	void takeOff() {
		System.out.println("PassengerPlane is TakingOff");
		}
	
	
	void fly() {
		System.out.println("PassengerPlane is Flying");
	}
	
	
	void land() {
		System.out.println("PassengerPlane is Landing");
	}
}
