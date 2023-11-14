package com.Spring.SpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Spring.SpringFramework")
public class VehicleConfigure {
@Bean
public Vehicle getCar() {
	return new Car();
}

@Bean
public Vehicle getBike() {
	return new Bike();
}

@Bean
public Tyre tyre() {
	Tyre tyre=new Tyre();
	tyre.setBrand("MRF");
	return tyre;
}
}
