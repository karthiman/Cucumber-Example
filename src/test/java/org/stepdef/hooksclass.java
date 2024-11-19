package org.stepdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksclass {
	@Before
	public void before() {
		System.out.println("login");
	}
    @After
	public void after() {

		System.out.println("close");

	}
}
