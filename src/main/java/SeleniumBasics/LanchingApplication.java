package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchingApplication {
	/*Facebook login
	 * 1.open the browser
	 * 2.enter the url
	 * 3.enter username
	 * 4.enter password
	 * 5.click on login button 
	 * 6.close browser
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("");
		
		//enter the password as testpassword
		driver.findElement(By.name("pass")).sendKeys("testpassword");
		driver.findElement(By.name("login")).click();
		
		

	}

}
