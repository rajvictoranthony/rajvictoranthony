package Org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriv {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\Karthik\\eclipse-workspace1\\FirstMAvenclass\\Excel\\New data.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet sheet1 = w.getSheet("Sheet1");
		
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			Row rw1 = sheet1.getRow(i);
			System.out.println(sheet1.getPhysicalNumberOfRows());
			for (int j = 0; j < rw1.getPhysicalNumberOfCells(); j++) {
				Cell cell1 = rw1.getCell(j);
				System.out.println("number of cell"+rw1.getPhysicalNumberOfCells());
				
				int celltype = cell1.getCellType();
				
				if (celltype==1) {
					String Value = cell1.getStringCellValue();
					System.out.println(Value);
				}else if (celltype==0) {
					if (DateUtil.isCellDateFormatted(cell1)) {
						Date Value1 = cell1.getDateCellValue();
						
					
				}else {
					double Value3 = cell1.getNumericCellValue();
					
					long l = (long)Value3;
					String Value4 = String.valueOf(l);
					System.out.println(Value4);
					
				}
				}
			}
			
			
		}
		
				
	}
	
	
	
	
	
	
	
	
	
	
	}