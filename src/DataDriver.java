import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DataDriver {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			Workbook wb1= Workbook.getWorkbook(new File ("D:\\book1.xlsx"));
			Sheet sheet = wb1.getSheet(0);
			int rowsCount = sheet.getRows();
			int columnsCount = sheet.getColumns();
			
			String[][] data = new String[rowsCount][columnsCount];
			
			for(int i=0;i<rowsCount;i++) {
				for(int j=0;j<columnsCount;j++) {
					Cell cell = sheet.getCell(j,i);
					data[i][j] = cell.getContents();
					
				}
			}
			
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
			
			
			
			/*
			public static void getWorkbook() throws BiffException, IOException{
				String fileLocation= "D:\\book1.xlsx";
				File file = new File (fileLocation);
				
				wb = Workbook.getWorkbook(file);
				
				
			}
			
				
			
			public static String[][] ExtractedUser() throws BiffException, IOException {
				

				
			Sheet sheet = wb.getSheet("Sheet1");
				int rowsCount = sheet.getRows();
				int columnsCount = sheet.getColumns();
				
				String[][] data = new String[rowsCount][columnsCount];
				
				for(int i=0;i<rowsCount;i++) {
					for(int j=0;j<columnsCount;j++) {
						Cell cell = sheet.getCell(j,i);
						data[i][j] = cell.getContents();
						
					}
				}
				return data;
			}*/
}
			