package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.findElement(By.xpath("<input aria-label=\"Phone number, username, or email\" aria-required=\"true\" autocapitalize=\"off\" autocorrect=\"off\" maxlength=\"75\" class=\"_aa4b _add6 _ac4d _ap35\" dir=\"\" type=\"text\" value=\"\" name=\"username\">"));
		driver.findElement(By.name("username")).sendKeys("TestData");
		driver.findElement(By.name("password")).sendKeys("$TestPassword");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	
	

}
