package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestSim {
	@Autowired
	@Qualifier("jio")
	private Sim sim;
	
	public void addCall() {
		sim.call();
	}
}


/*
 * @Autowired
	private Airtel airtel;
	i can do this but i cannot do 
	
	@Autowired
	private Sim sim;
	
	we use to write it as Sim sim = new Airtel() or Jio();...
	
	it creates a error due to ambuigity it dont 
	i say spring to autowire it will auto wire airtel or jio ?? 
	
	Sept 04, 2025 12:44:01 PM org.springframework.context.support.AbstractApplicationContext refresh
	WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'testSim': Unsatisfied dependency expressed through field 'sim': No qualifying bean of type 'com.Sim' available: expected single matching bean but found 2: airtel,jio

	If we have mutliple beans for the interfaces or classes 
	we have  @Qualifer("") it is a important annotation 
	
	@Qualifier used when there are may be any number of beans but when i give the bean name it will 
think like i has autowire jio object .. im giving a qualifying object 

	we are saying spring what to call 
 * 
 */
