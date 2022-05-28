package excell;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellsheet_1 {
public static void main(String[] args) throws IOException {
	
		
	   File src =new File("C:\\Users\\DELL\\Desktop\\Book1.xlsx");

	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
	int rowCount = sh.getLastRowNum();
	System.out.println(rowCount);
	short cellCountforRow1 = sh.getRow(0).getLastCellNum();
	short cellCountforRow2 = sh.getRow(1).getLastCellNum();
	short cellCountforRow3 = sh.getRow(2).getLastCellNum();
	System.out.println(cellCountforRow1);
	System.out.println(cellCountforRow2);
	System.out.println(cellCountforRow3);
	System.out.println(sh.getRow(0).getCell(0));
	for (int i=0;i<=sh.getLastRowNum();i++)
	   {
		  for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
		   {
			XSSFCell testdata = sh.getRow(i).getCell(j);
			System.out.print(testdata+"     ");
			
		    }
		System.out.println();

		}
	    }
		
	    }


	
	