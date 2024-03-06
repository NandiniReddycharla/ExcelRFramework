package SeleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverclickExample {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement places=driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions act=new Actions(driver);
		act.moveToElement(places).perform();
		WebElement shirtsLink = driver.findElement(By.xpath("//a[text()='Shirts']"));
		shirtsLink.click();
		
		// JavaScript Executor code to click on a hidden element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('hiddenElement').click();");
		
		// JavaScript Executor code to send keys to a hidden element
		js.executeScript("document.getElementById('hiddenElement').value = 'Text to send';");
	
		// Switching to a new window
		String mainWindowHandle = driver.getWindowHandle();
		// Perform action that opens a new window
		// For example, clicking on a link that opens a new window
		WebElement linkToNewWindow = driver.findElement(By.xpath("//a[contains(text(),'Link to new window')]"));
		linkToNewWindow.click();
		
		// Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		// Loop through each window handle
		for (String handle : allWindowHandles) {
		    // Switch to the window
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		
		// After performing actions on new window, switch back to main window
		driver.switchTo().window(mainWindowHandle);
		
		// Closing the browser
		driver.quit();
	}


	}



