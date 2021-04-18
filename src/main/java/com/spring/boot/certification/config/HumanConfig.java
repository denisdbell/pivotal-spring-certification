package com.spring.boot.certification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.boot.certification.injection.models.Child;
import com.spring.boot.certification.injection.models.Human;
import com.spring.boot.certification.injection.models.Parent;

@Configuration
public class HumanConfig {
   /***
	** Bean definitions
	***/
	
	/**
	 * Used for constructor injection
	 */
	@Bean 
	Child getChild1() {
		return new Child();
	}
	
	@Bean 
	Child getChild2() {
		return new Child();
	}
	
	@Bean 
	Child getChild3() {
		return new Child();
	}
	
	@Bean
	Human getParent(){
		return new Parent(getChild1());	
	}
}
