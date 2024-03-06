package Testngbasics;

import org.testng.annotations.Test;

public class LoginTC {
	@Test(groups= {"smoke","login"})
	public void loginsmokeTC1() {
		System.out.println(" login smoke TC 1");
		
	}
	@Test(groups= {"regression","login"})
	public void loginTC2() {
		System.out.println(" login TC 2");
		
	}
	@Test(groups= {"regression","login"})
	public void loginTC3() {
		System.out.println(" login TC 3");
		
	}



}
