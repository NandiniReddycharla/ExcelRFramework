package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxdemo {
	public static void main(String[] args) {
		
		//isDisplayed()
		//isEnabled()
		//isSelected()
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		//checkbox1
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();

		//checkbox2
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected());
		
		driver.close();
		
		
	}

}
