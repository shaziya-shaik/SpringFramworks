package com.Spring.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Configuration  used instead of xml
@Component
public class Tyre {
	//@Bean used instead of xml
	private String brand;

//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	
	
}
