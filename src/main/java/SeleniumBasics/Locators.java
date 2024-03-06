package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	/*
	 * Locators:
	 * 
	 * id:
	 * name:
	 * 
	 * css:copy selector
	 * #email
	 * 
	 * xpath:
	 * 1.absoulte Xpath:/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
	 * 2.Relative Xpath://*[@id="email"]
	 * 
	 * classname:
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();

		

}
}
