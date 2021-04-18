package com.spring.boot.certification.injection.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Parent extends Person {

	
	Child child1;
	Child child2;
	
	@Autowired
	@Qualifier("getChild3")
	Child child3;
	
	/**
	 * Constructor injection
	 * */
	@Autowired
	public Parent(Child child) {
		
		child1 = child;
	}
	
	/**
	 * Setter injection
	 * 
	 */
	@Autowired
	@Qualifier("getChild2")
	public void setChild2(Child child) {
		child2 = child;
	}
}
