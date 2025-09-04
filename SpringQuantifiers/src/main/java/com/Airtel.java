package com;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("The sim Airtel is activated!...");
	}

}
