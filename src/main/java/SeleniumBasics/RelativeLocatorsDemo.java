package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemo {
	
	//above
	//below
	//left
	//right
	//near
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		
		//find password field
		WebElement password=driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
		password.sendKeys("test");
		
		//click on forgot password link from login button	
		WebElement loginbutton=driver.findElement(By.name("login"));
        driver.findElement(RelativeLocator.with(By.tagName("a")).below(loginbutton)).click();
		
		
	}

}
