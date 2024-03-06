package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) {
		//hover();
		//clicks();
		scrolling();
		//keyboardevents();
		//copyPaste();
		//dragdrop();
		
		
	}
	public void hover() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement places=driver.findElement(By.xpath("//a[text()='Kids']"));
		Actions act=new Actions(driver);
		act.moveToElement(places).perform();
		
	}
	public static void clicks() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		//act.contextClick().perform();
		
		//right click on a specific element
		//WebElement username=driver.findElement(By.id("email"));
		//act.contextClick(username).perform();	
		
		WebElement username=driver.findElement(By.id("pass"));
		act.contextClick(username).perform();
		
		//double-click on webelement
		act.click(username).sendKeys("admin123");
	}
	//scrolling
	public static void scrolling() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		
		//scrolling-horizontally and vertically
		//accepts 2 parameters
		//first parameter-to scroll horizontally(+ve value scrolls right)
		//second parameter-to scoll vertically(+ve value scrolls down)
		//act.scrollByAmount(0,600).perform();
		
		//scrolling to a specific webelement
		WebElement target=driver.findElement(By.xpath("//h2[text()='work from home essentials']"));
        act.scrollToElement(target).perform();
	}
	public  static void keyboardevents() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement username=driver.findElement(By.id("email"));
		act.click(username).keyDown(Keys.SHIFT).sendKeys("testusername").keyUp(Keys.SHIFT).perform();		
		
	}
	public static void copyPaste() {
		//Open FB
		//write testusername in username field
		//copy the value from username field
		//paste it in password field
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement username=driver.findElement(By.id("email"));
		WebElement pasword=driver.findElement(By.id("pass"));
	   	act.sendKeys(username, "testusername").doubleClick().keyDown(Keys.CONTROL).sendKeys("c").click(pasword).keyDown(Keys.CONTROL).sendKeys("v").perform();	
		
	}
	
	//drag and drop
	//launch this website
	//https://jqueryui.com/droppable/
	//identify source element
	//identify target element
	//use dragand drop method present in action class
	public static void dragdrop() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement source=driver.findElement(By.id("draggable"));
	    WebElement target=driver.findElement(By.id("droppable"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(source, target).perform();
		
	}
	
	public void name() {
		
	}
	
	

}
