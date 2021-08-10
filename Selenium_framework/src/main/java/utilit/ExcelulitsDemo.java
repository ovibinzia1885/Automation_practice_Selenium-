package utilit;

public class ExcelulitsDemo {
	public static void main(String[] args) {
		 String projectpath=System.getProperty("user.dir");
		Excelutils excel=new Excelutils(projectpath+"/excel/data.xlsx", "SignUp_TS01");
		excel.getCellDataString(1, 0);
	}
}
