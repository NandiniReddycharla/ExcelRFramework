package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {
	public static void main(String[] args) {
		//FindElement
		//FindElements
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//get all urls
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
       //text of the each url
		for (WebElement url : urls) {
			System.out.println(url.getText());
			System.out.println(url.getAttribute("title"));
			System.out.println(url.getAttribute("href"));
			
		}
		driver.close();
		}
}
