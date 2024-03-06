package Testngbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ExcelReader.ExcelReaderUtility;

public class DataProvider {
	//execute the TC multiple times
	//with diff set of data
	//admin,admin123
	//hr,hr123
	//finance,finance123
	
	//another TC with 4 rows and 3 parameters
	
	
	@Test(dataProvider = "getExcelData")
	public void login(String username,String password) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("email")).sendKeys(password);
		
	}
	
	
	
	@org.testng.annotations.DataProvider
	public Object[][] getExcelData() throws IOException{
		String filepath=".\\src\\main\\java\\ExcelReader\\dataexcel.xlsx";
		String sheetname="username";
		return ExcelReaderUtility.getData(filepath,sheetname);
		
	}
	public Object[][] getData() {
		//first parameter defines the no of rows
		    //how many times we want to execute the TC 
		//second parameters define the no of cols
		    //how many parameters for each iteration
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="Admin123";
		
		data[1][0]="hr";
		data[1][1]="hr123";
		
		data[2][0]="finance";
		data[2][1]="finance123";
		
		return data;
	}

}
