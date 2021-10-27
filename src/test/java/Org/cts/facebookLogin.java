package Org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class facebookLogin {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Karthik\\eclipse-workspace1\\FirstMAvenclass\\Testdata\\New data.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet sheet1 = w.getSheet("Sheet1");
		
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows() ; i++) {
			
			Row r1 = sheet1.getRow(i);
			
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
				
				Cell cell1 = r1.getCell(j);
				
				int cellType = cell1.getCellType();
				
				if (cellType==1) {
					String value = cell1.getStringCellValue();
					System.out.println(value);
					
					
				} else if (cellType==0) {
					
					if (DateUtil.isCellDateFormatted(cell1)) {
						
						Date date1 = cell1.getDateCellValue();
						
						SimpleDateFormat d1 = new SimpleDateFormat("dd-MM-YYYY");
						
						String value = d1.format(date1);
						System.out.println(value);
					}
				
					
				}else  {
					double n1 = cell1.getNumericCellValue();
					
					long value = (long) n1;
					
					System.out.println(value);
					
					 
						
				}
				
				}
				
				
				
				
			}
		}
		
		
		
		
		
	}
	

