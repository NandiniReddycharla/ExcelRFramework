package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {
	public static void main(String[] args) {
		//https://cosmocode.io/automation-practice-webtable/
		//how many tables are present in this page
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	    List<WebElement> tables = driver.findElements(By.tagName("table"));
	    System.out.println(tables.size());
	    
	    //how many rows are there

	    List<WebElement> rows = driver.findElements(By.tagName("tr"));
	    System.out.println("Row Count==>"+rows.size());
	    
	    //how many column are there
	    List<WebElement> cols = driver.findElements(By.xpath("//tr[1]/td"));
	    System.out.println("columns Count==>"+cols.size());
	    
	    //click on the checkbox present for argentina
	  //*[@id="countries"]/tbody/tr[8]/td[1]/input
	    
	    //driver.findElement(By.xpath(" //tr[8]/td[1]/input")).click();
	    //search for argentina first and then go to the checkbox
	    
	    
	    driver.findElement(By.xpath("//strong[text()='Argentina']/parent::td/preceding-sibling::td/input")).click();
	    //driver.close();
	}

}
