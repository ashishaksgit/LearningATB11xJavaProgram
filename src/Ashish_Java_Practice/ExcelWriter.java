package Ashish_Java_Practice;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExcelWriter {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook(); // Create a new Excel workbook
        Sheet sheet = workbook.createSheet("Sheet1"); // Create a new sheet

        Row row = sheet.createRow(0); // Create a row at index 0
        Cell cell = row.createCell(0); // Create a cell at column index 0
        cell.setCellValue("Hello, Apache POI!"); // Set cell value

        // Write the workbook to a file
        FileOutputStream fileOut = new FileOutputStream("example.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

        System.out.println("Excel file created successfully!");
    }

}
