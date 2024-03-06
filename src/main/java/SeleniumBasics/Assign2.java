package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign2 {
	public static void main(String[] args) {
		//open https://practice.automationtesting.in/
		//click on add to basket>> Thinking in HTML
		//click on view basket
		//verify if the same coursename is present in the basket
		//verify the quantity is 1
		//click on checkout button
		//enter all the details
		
		//NOTE:don't hardcode the book name
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String coursename="Thinking in HTML";
		
		driver.findElement(By.xpath("//h3[text()='Thinking in HTML']/parent::a/following-sibling::a")).click();
		driver.findElement(By.xpath("//a[text()='View Basket']")).click();
		String name=driver.findElement(By.xpath("//td[@data-title='Product']")).getText();
	    if(name.equals(coursename)) {
	    	System.out.println("Course name is maching");
	    }else {
	    	System.out.println("course name is not maching");
	    }
	    //validate that the value displayed for the code is 1?
	    int expqty=1;
	    String temp=driver.findElement(By.xpath("//input[@title='Qty']")).getAttribute("value");
	    int actqty=Integer.parseInt(temp);
	    if(expqty==actqty) {
	    	System.out.println("The quantity displayed is 1");
	    }else {
	    	System.out.println("Quantity displayed is not matching with expected quantity");
	    	
	    }
	    driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
	    
	    //Adding customer details
	    driver.findElement(By.id("billing_first_name")).sendKeys("testadata");
	    driver.findElement(By.id("billing_last_name")).sendKeys("lastdata");
	    driver.findElement(By.id("billing_company")).sendKeys("companydata");
	    driver.findElement(By.id("billing_email")).sendKeys("email@gmail.com");
	    driver.findElement(By.id("billing_phone")).sendKeys("9876543210");
	    driver.findElement(By.id("billing_address_1")).sendKeys("village");
	    driver.findElement(By.id("billing_address_2")).sendKeys("steet");
	    driver.findElement(By.id("billing_city")).sendKeys("city");
	    driver.findElement(By.id("billing_postcode")).sendKeys("5436897");
	    driver.findElement(By.id("place_order")).click();
	    String expmessage="Thank you.your order had been received.";
	    String actmessage=driver.findElement(By.xpath("//div[@class='woocommerce']/p[1]")).getText();
	    if(expmessage.equals(actmessage)) {
	    	System.out.println("Order placed successfully");
	    }else {
	    	System.out.println("could not place order!!!");
	    }
	    driver.close();
	    
	    
	    
	   
	
	}

}
