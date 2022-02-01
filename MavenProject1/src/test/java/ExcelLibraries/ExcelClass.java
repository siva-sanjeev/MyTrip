package ExcelLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelClass {
	
	
//	@DataProvider(name = "data")
	  public Object[][] dataSupplier() throws IOException {

	    File file = new File("C:\\Eclipse\\MavenProject1\\ExcelFiles\\DriveLogin.xlsx");
	    FileInputStream fis = new FileInputStream(file);

	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wb.getSheetAt(0);
	    wb.close();
	    int lastRowNum = sheet.getLastRowNum() ;
	    int lastCellNum = sheet.getRow(0).getLastCellNum();
	    Object[][] obj = new Object[lastRowNum][1];

	    for (int i = 0; i < lastRowNum; i++) {
	      Map<Object, Object> datamap = new HashMap<>();
	      for (int j = 0; j < lastCellNum; j++) {
	        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
	      }
	      obj[i][0] = datamap;
	      System.out.println("OBJ value: " + obj[i][0]);

	    }
	    return  obj;
	  }

	
	@DataProvider(name = "LoginData")
	public Object[][] readDataFromExcel_login() throws IOException{
		
		System.out.println("Entered in Excel class");
		
		File filepath = new File("C:\\Eclipse\\MavenProject1\\ExcelFiles\\DriveLogin.xlsx");
		FileInputStream filStrm = new FileInputStream(filepath);
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(filStrm);
		XSSFSheet sheet = workbook.getSheet("login");
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		int RowCount = sheet.getLastRowNum();
		System.out.println("Total row count: ");
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] excelDatas = new Object[RowCount][1];
		
		for(int i=0; i<RowCount; i++) {
			
			Row rowName = sheet.getRow(i);
			
			for(int j=0; j<columnCount; j++) {
				
				Cell cellValue = rowName.getCell(j);
				Cell cellValueForHeader = sheet.getRow(0).getCell(j);
				
				map.put(cellValueForHeader.getStringCellValue(), cellValue.getStringCellValue());
				
			}
			
			excelDatas[i][0] = map;
			System.out.println("value displays as: " + excelDatas[i][0]);
			
			
		}
		
		return null;
			
		
	}

}
