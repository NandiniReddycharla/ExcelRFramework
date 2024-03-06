package Testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeMethod
	public void browserSetup() {
		System.out.println("open the Browser");
		System.out.println("Launch the application");
		System.out.println("Enter username and password");
		System.out.println("Click on login button");
		
	}
	
	@Test
	public void login() {
		System.out.println("Login TC");
		
	}
	
	@Test
	public void sendFriendRequest() {
		System.out.println("Search for a user");
		System.out.println("Click on send Friend Request");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close browser");
		
	}
	@AfterSuite
	public void sendReport() {
		System.out.println("Sending Report");
		
	}

}
