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

import Org.Base.Baseclass;

public class Exceldata extends Baseclass{

public static void main(String[] args) throws IOException  {
		
	File f = new File("C:\\Users\\Karthik\\eclipse-workspace1\\FirstMAvenclass\\Testdata\\New data.xlsx");
	
	FileInputStream fin = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet sheet1 = w.getSheet("Sheet2");
	
	for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			Row r1 = sheet1.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
				
				Cell cell1 = r1.getCell(j);
				
				int cellType = cell1.getCellType();
				
				if (cellType==1) {
					
					String Value = cell1.getStringCellValue();
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell1)) {
						Date de = cell1.getDateCellValue();
					
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					String Value = sim.format(de);
					System.out.println(Value);
					
					}else { 
						
						double num = cell1.getNumericCellValue();
						
						long d = (long)num;
						String Value = String.valueOf(d);
						
						
					}
				}
				
				
			}
	}
				
				
			}
}
			
	

