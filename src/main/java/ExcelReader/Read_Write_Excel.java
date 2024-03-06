package ExcelReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Write_Excel {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ExcelRSelenium\\src\\main\\java\\ExcelReader\\Read_Write_data.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("userdata"); 
        // Count the total number of rows present in the sheet
        int rowcount = sheet.getLastRowNum() + 1; 
        System.out.println("Total number of rows present in the sheet : " + rowcount);
        // get column count present in the sheet
        int colcount = sheet.getRow(0).getLastCellNum();
        System.out.println("Total number of columns present in the sheet : " + colcount);
        
        for (int i = 1; i < rowcount; i++) {
            XSSFCell cell = sheet.getRow(i).getCell(1);
            String celltext = "";
            
            switch (cell.getCellType()) {
                case STRING:
                    celltext = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    celltext = String.valueOf(cell.getNumericCellValue());
                    break;
                case BLANK:
                    celltext = "";
                    break;
                default:
                    celltext = "";
                    break;
            }

            // Check the age and set the Cell value into excel
            if (!celltext.isEmpty() && Double.parseDouble(celltext) >= 18) {
                sheet.getRow(i).createCell(2).setCellValue("Major");
            } else {
                sheet.getRow(i).createCell(2).setCellValue("Minor");
            }
        }

        // close the file input stream
        fis.close();

        // Open an excel to write the data into workbook
        FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\ExcelRSelenium\\src\\main\\java\\ExcelReader\\Read_Write_data.xlsx");

        // Write into workbook
        wb.write(fos);

        // close file output stream
        fos.close();
    }
}
