package Testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameter {
	
	@Parameters({"un","pwd"})
	@Test
	public void validateLogin(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//username and password
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("Password");
	}

}
