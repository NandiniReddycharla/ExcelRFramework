package SeleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {
	
	//select
	//index
	//value
	//visibleText
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select obj=new Select(dropdown);
		//obj.selectByIndex(1);
		//obj.selectByValue("1");
		//obj.selectByVisibleText("Option 2");
		
		//get all the options available in the dropdown store it in a variable
		//print the count of options
		//print the test of the each option
		//obj.getAllSelectedOptions();
	   List<WebElement> option = obj.getOptions();
	   System.out.println(option.size());
	   for (WebElement opt : option) {
		   System.out.println(opt.getText());
		
	}
	   driver.close();
		
	}

}
