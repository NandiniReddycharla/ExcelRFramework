package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowAssignment {
	public static void main(String[] args) {
		//https://demo.automationtesting.in/Windows.html
		//get the title and print it
		//click on the click button to open a new window
		//navigate to the new window
		//get the title and print
		//navigate back to the old window
		//get the title and print it
		//close the window
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		WebElement title=driver.findElement(By.xpath("//a[@href='#Tabbed']"));
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.navigate().to(By.xpath("//a[@href='#Seperate']"));
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	
}
