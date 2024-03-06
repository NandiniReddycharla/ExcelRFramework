package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	

	public static void main(String[] args, String cwindowid) {
		//open https://the-internet.herokuapp.com/windows
		//print the title of the page: the internet
		//click on Click here link
		//print the title of the page:new window
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getWindowHandle());
		System.out.println("parent Window Title"+driver.getTitle());
		driver.findElement(By.linkText("Click Here")).click();
		//at this point,there are 2 windows
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		System.out.println("Parent Window ID"+driver.getTitle());
		System.out.println("Child Window ID"+driver.getTitle());
		
		
		//to get the title of the new window,we need to switch to the window
		driver.switchTo().window(cwindowid);
		System.out.println("Child Window Title"+driver.getTitle());
		
		//to get the title of the new window,we need to switch to that window
		System.out.println("Parent window title"+driver.getTitle());
		
		
		
	}

}
