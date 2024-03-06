package Testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void validateTitle() {
		//open FB
		//get the title
		//if act title ="facebook-login or sign up"
		//then printbTC Pass
		//else Print TC fail
		
		//Assertions are used to mark your tc pass or fail
		
		
	    
		String exptitle="Facebook – log in or sign up ";
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
			
	}
	@Test
	public void validateUsernameFieldPresence() {
		boolean username=driver.findElement(By.name("email")).isDisplayed();
		Assert.assertTrue(username);
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	
	}

}
