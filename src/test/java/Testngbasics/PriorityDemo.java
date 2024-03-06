package Testngbasics;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	
	//default order of execution is alphabetically
	//lower priority will be executed first
	//default priority
	//
	
	//create 4 test methods with name as
	//abc
	//pqr
	//tuv
	//xyz
	@Test(enabled=false)
	public void abc() {
		System.out.println("abc");
		
	}
	@Test(priority=2)
	public void pqr() {
		System.out.println("pqr");
		
	}
	@Test(priority=-1)
	public void tuv() {
		System.out.println("tuv");
		
	}
	@Test(priority=3,enabled=false)
	public void xyz() {
		System.out.println("xyz");
		
	}
	@Test(priority=-2)
	public void Apple() {
		System.out.println("Apple");
		
	}

}
