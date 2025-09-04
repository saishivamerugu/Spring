package com;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

	@Override
	public void call() {
		System.out.println("The sim jio was activated!...");
	}

}
