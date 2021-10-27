package Org.cts;

import java.awt.event.FocusAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutputFile {
	
	public static void main(String[] args) throws IOException {
		
		File F = new File("C:\\Users\\Karthik\\eclipse-workspace1\\FirstMAvenclass\\Excel\\Victor.xlsx");
		
		boolean a = F.createNewFile();
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createSheet = w.createSheet("Alvinnn");
		
		Row rw = createSheet.createRow(0);
		Cell ce1 = rw.createCell(3);
		ce1.setCellValue(3454);
		
		FileOutputStream f = new FileOutputStream(F);
		w.write(f);
		System.out.println(":Cund");		
		
	}

}
