package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		//driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		//First Alert
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(2000);
		String expmessage="alert the msg";
		String actmessage=driver.switchTo().alert().getText();
		if(expmessage.equals(actmessage)) {
			System.out.println("Alert1 TC PASS");
		}else {
			System.out.println("Alert1 Tc Fail");
		}
		driver.switchTo().alert().accept();
		
		//Second Alert
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
		Thread.sleep(2000);
		String expmessage1="Press a Button";
		String actmessage1=driver.switchTo().alert().getText();
		if(expmessage1.equals(actmessage1)) {
			System.out.println("Alert1 TC PASS");
		}else {
			System.out.println("Alert1 Tc Fail");
		}
		driver.switchTo().alert().accept();
		
		//third Alert
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//div[@id='Textbox']")).click();
		Thread.sleep(2000);
		String expmessage2="please enter your name";
		String actmessage2=driver.switchTo().alert().getText();
		if(expmessage2.equals(actmessage2)) {
			System.out.println("Alert1 TC PASS");
		}else {
			System.out.println("Alert1 Tc Fail");
		}
		driver.switchTo().alert().sendKeys("nandini");
		driver.switchTo().alert().accept();
		//validate that the result contains the text you entered in the alert
		//if contains,say alert message contains the text
		//else,say alert message does not contains the text
		
		
	
		
	}

}
