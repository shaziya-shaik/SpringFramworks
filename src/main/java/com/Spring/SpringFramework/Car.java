package com.Spring.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//annotation based configuration
public class Car implements Vehicle{
	
//	public void drive() {
//		System.out.println("car drive");
//	}
	@Autowired
	private Tyre tyre;
//	public Tyre getTyre() {
//		return tyre;
//	}
//	public void setTyre(Tyre tyre) {
//		this.tyre = tyre;
//	}
//	
//	@Override
//	public String toString() {
//		return "Car [tyre=" + tyre + "]";
//	}
	public void drive() {
		System.out.println("car  "+tyre.getBrand());
	}
}
