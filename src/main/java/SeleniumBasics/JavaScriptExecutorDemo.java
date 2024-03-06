package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	//click an element
			//scroll by some pixels
			//scroll to a webelement
			//scroll to the bottom of the page
			//get the text
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//WebElement cartlink=driver.findElement(By.xpath("//a[text()='Cart']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()",cartlink);
		
		////scroll by some pixels
		//js.executeScript("window.scrollTo(0, 400)");
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement temp=driver.findElement(By.xpath("//a[@data-group='kids']"));
		System.out.println(js.executeScript("return arguments[0].innerText",temp));
		js.executeScript("arguments[0].style.backgroundColor='red'",temp);
		js.executeScript("alert('Hello')");
		driver.switchTo().alert().accept();
		
		
	
	}

}
