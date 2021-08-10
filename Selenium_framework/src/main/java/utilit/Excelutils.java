package utilit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	static String projectpath;
	static  XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excelutils(String excelpath ,String sheeNmae) {
		try {

			projectpath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheeNmae);
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}



	public static void main(String[] args) {
		//getRowCount();
		//getCellDataString(1,0);
		//getCellDataNumber();
	}

	public static void getRowCount() {
		try {

			projectpath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet=workbook.getSheet("SignUp_TS01");

			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows:"+rowcount);
		}catch(Exception exp) {
			System.out.println("Message"+exp.getMessage());
			System.out.println("Message"+exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void getCellDataString(int rownum,int colnum) {


		try {
			String cellData=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(cellData);

		}catch(Exception exp) {
			System.out.println("Message"+exp.getMessage());
			System.out.println("Message"+exp.getCause());
			exp.printStackTrace();

		}
	}

	public static void getCellDataNumber() {
		try {
			projectpath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
			sheet=workbook.getSheet("SignUp_TS01");
			double cellData=sheet.getRow(1).getCell(0).getNumericCellValue();
			System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println("Message"+exp.getMessage());
			System.out.println("Message"+exp.getCause());
			exp.printStackTrace();

		}



	}


}
