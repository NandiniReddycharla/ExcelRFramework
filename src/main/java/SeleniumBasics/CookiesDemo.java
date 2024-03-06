package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CookiesDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<Cookie> cookies = driver.manage().getCookies();
		//System.out.println();
		//driver.manage().deleteAllCookies();
		System.out.println(cookies.size());
		for (Cookie abc : cookies) {
			System.out.println(abc);
		}
		driver.close();
	}

}
