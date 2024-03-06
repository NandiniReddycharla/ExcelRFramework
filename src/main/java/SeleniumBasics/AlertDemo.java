package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	//whenever there is an alert on the page,we need to handle the alert
	//Types of Alert:
	//1.ALert
	//2.Confirmation
	//3.prompt
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		//at this point and alert is present
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmexample")).click();
		//try to handle this alert also
		
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("nandini");
		driver.switchTo().alert().accept();
		}
}
