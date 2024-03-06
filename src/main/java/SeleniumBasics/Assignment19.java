package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment19 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		 List<WebElement> elementTodrag = driver.findElements(By.className("dragarea"));
		 WebElement elementTodrop=driver.findElement(By.id("droparea"));
		//WebElement elementTodrag=driver.findElement(By.id("angular"));
		//WebElement elementTodrop=driver.findElement(By.id("droparea"));
		Actions actions=new Actions(driver);
		for (WebElement element : elementTodrag) {
			actions.dragAndDrop(element,elementTodrop).build().perform();
		}
		//actions.dragAndDrop(elementTodrag, elementTodrop).perform();
	}

}
