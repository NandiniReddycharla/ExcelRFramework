package Testngbasics;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount = 3)
	public void tc1() {
		System.out.println("TC 1");
		
	}
	
	@Test
	public void tc2() {
		System.out.println("TC 2");
		
	}

}
