package ExcelReader;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class ExcelReadWriteProgram1 {

	    public static void main(String[] args) {
	        // Specify the path to your Excel file
	        String inputExcelFilePath = "C:\\Users\\DELL\\Downloads\\Read_Data.xlsx";
	        String outputExcelFilePath = "C:\\Users\\DELL\\Downloads\\Write_Data.xlsx";

	        try {
	            // Read data from Excel file
	            readExcel(inputExcelFilePath);

	            // Write data to a new Excel file
	            writeExcel(outputExcelFilePath);
	        } catch (IOException | InvalidFormatException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void readExcel(String excelFilePath) throws IOException, InvalidFormatException {
	        FileInputStream fileInputStream = new FileInputStream(excelFilePath);
	        Workbook workbook = WorkbookFactory.create(fileInputStream);

	        // Assuming the data is in the first sheet
	        Sheet sheet = workbook.getSheetAt(0);

	        // Iterate through rows and columns to read data
	        System.out.println("Reading data from Excel:");
	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                switch (cell.getCellType()) {
	                    case STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                    case NUMERIC:
	                        System.out.print(cell.getNumericCellValue() + "\t");
	                        break;
	                    case BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue() + "\t");
	                        break;
	                    case BLANK:
	                        System.out.print("BLANK\t");
	                        break;
	                    default:
	                        System.out.print("DEFAULT\t");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }

	        // Close the workbook and input stream
	        workbook.close();
	        fileInputStream.close();
	    }

	    private static void writeExcel(String excelFilePath) throws IOException {
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Sheet1");

	        // Sample data to be written to Excel
	        Object[][] data = {
	                {"Name", "Age", "Marks"},
	                {"Nandhu", 21, "86"},
	                {"Sweety", 22, "77"}
	        };

	        // Write data to the Excel sheet
	        System.out.println("\nWriting data to Excel:");
	        int rowNum = 0;
	        for (Object[] rowData : data) {
	            Row row = sheet.createRow(rowNum++);
	            int colNum = 0;
	            for (Object field : rowData) {
	                Cell cell = row.createCell(colNum++);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	                System.out.print(field + "\t");
	            }
	            System.out.println(); // Move to the next line after each row
	        }

	        // Save the workbook to the specified file
	        try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
	            workbook.write(fileOutputStream);
	        }

	        // Close the workbook
	        workbook.close();
	    }
	
	}

