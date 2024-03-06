package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.page.Page.CaptureScreenshotFormat;

import com.google.common.io.Files;

public class ScreenShotDemo {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		String path="./Screenshot/test.png";
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    captureScreenshot("loginpage");
	  //make sure to refresh the project to see the new file
	    driver.findElement(By.linkText("Forgotten password?")).click();
	    captureScreenshot("forgotloginpage");
		driver.close();
	}
		
		public static void captureScreenshot(String name) throws IOException {
			String path="./Screenshot/"+name+".png";
		
		//to take screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scrnshot=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(scrnshot,new File(path));
		
		//make sure to refresh the project to see the new file
		
		driver.close();
	}

}
