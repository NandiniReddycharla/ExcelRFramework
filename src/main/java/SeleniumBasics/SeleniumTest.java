package SeleniumBasics;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import java.util.Set;

	public class SeleniumTest {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	            // Navigate to the webpage
	            driver.get("https://www.myntra.com/");

	            // Mouse hover action 
	            WebElement elementToHover = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
	            Actions actions = new Actions(driver);
	            actions.moveToElement(elementToHover).perform();

	            // Click on Enter 
	            actions.sendKeys(Keys.ENTER).perform();

	            // Click on a hidden element using JavaScript executor
	            WebElement hiddenElement = driver.findElement(By.xpath("//a[contains(text(),'Kids')]"));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hiddenElement);

	            // Send keys to a hidden element using JavaScript executor
	            // (This may not work for all hidden elements, as some may not accept input)
	            // Let's try clicking on the search box and typing something
	            WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	            searchBox.click();
	            searchBox.sendKeys("Shoes");

	            // Switching between windows (if applicable)
	            // (For myntra.com, it seems there's no need to switch windows)
	            String mainWindowHandle = driver.getWindowHandle();
	            Set<String> windowHandles = driver.getWindowHandles();
	            for (String handle : windowHandles) {
	                if (!handle.equals(mainWindowHandle)) {
	                    driver.switchTo().window(handle);
	                    // Perform actions on the new window here
	                    System.out.println(driver.getTitle());
	                }
	            }
	            // Close the browser
	            driver.quit();

	        } 
	           
	           
	    }
	



