package ExcelReader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtility {
	public static Object[][] getData(String filepath,String sheetname) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook(filepath);
		XSSFSheet sheet=wb.getSheet("username");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
	    int colcount=sheet.getRow(0).getLastCellNum();
	   
	    
	    Object[][] data=new Object[rowcount][colcount]; 
	    for(int row=0; row < rowcount; row++) {
	    	for(int col=0; col < colcount; col++) {
	    		data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
	
	    	}
	   }
	    return data;
	
	
	
	    
	
	}

}
