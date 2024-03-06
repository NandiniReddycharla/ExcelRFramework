package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	/*
	 * Xpath
	 * 
     * XMLPath
     * 
     * Types:
     * 1. Absolute: full xpath from the HTML Page
     *              starts with single slash /
     *  /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
     * 2. Relative: starts from anywhere in the DOM
     *              starts with double slash //
     * //*[@id="email"]
     * 
     * 
     * Bldg : A
     * Gateway of India: Mumbai
     * 
     * Absolute
     * Delhi: 
     * auto to bus stand
     * bus stand take bus to airport
     * airport land to mumbai airport
     * mum airport take cab to andheri station
     * and station take local to churchgate
     * from churchgate take taxi to gateway of india
     * opp there is bldg names A
     * floor 3
     * room 302
     * 
     * Relative
     * gateway of india and opp bldg a
     * 
     * html
     *  head
     *  body
     *      div
     *      div
     *      div
     *          input(id = a)
     *      div
     * 
     * Absolute: /html/body/div[2]/input
     * Relative: //input[@id='a']
     * 
     * How to write XPath
     *  Basic Syntax:
     *  //htmlTag[@attributeName = 'value']
     * 
     * OrangeHRM
     *  Username: //input[@name = 'username']
     *  password:
     *  loginbtn
     * 
     * Facebook:
     *  email //input[@name='email']
     *  password //input[@name='pass']
     *  loginbtn: //button[@id='u_0_5_yC']
     *  
     * 1. AND OR
     *  QA env: button(id = qabtn)
     *  UAT env: button(id = uatbtn)
     * 
     *  //button[@id='uatbtn']
     * 
     *  //button[@id = 'qabtn' or @id = 'uatbtn']
     * //input[@id='email' or @id='pass']
     * 
     * 2. Contains
     *  QA env: button(id = login_qa_btn)
     *  UAT env: button(id = login_uat_btn)
     *  //button[contains(@id,'login')]
     *  //input[contains(@id,'mai')]
     *
     *  3. Text Method
     *  //a[text()='Forgotten password?']
     *  
     * 4. XPath Axes
     *  A. CHILD
 *      html
     *  head
     *  body
     *      div(id = a)
     *          div
     *              button
     *              input(id = abc)
     *              input
     *      div
     * 
     *  Identify XPATH for input element
     *  //div[@id='a']/child::input[1]
     *      OR
     *  //div[@id='a']/input[1]
     * 
     * FB email:
     *  //div[@class='_6lux'][1]/child::input
     *  //div[@class='_6lux'][1]/input
     * 
     * FB Password:
     *  //div[@class='_6lux'][2]/div/input
     * 
     * 
     * B. Parent
     *  //input[@id='email']/parent::div
     * 
     * C. Siblings
     *      preceding-sibling
     *      following-sibling
     *  //input[@id='abc']/following-sibling::input
     *  //input[@id='abc']/preceding-sibling::button
     * 
  
     *       
     *     
     *  
     * 
     * 
     */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("TestData");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("TestData");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("TestData");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("TestPassword");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        

}
}
