package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/tinymce");
		//how many frames are present on the page?
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//switch to the frame
		//index
		//id or name
		//webelement
		
		//switching using an id or name
		//driver.switchTo().frame("mce_0_ifr");
		
		
		//switching to Xpath
		WebElement target=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("nandini");
		
		//switching back to the parent or main window
		driver.switchTo().defaultContent();
		//driver.close();
		
	}

}
