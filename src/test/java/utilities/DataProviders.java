package utilities;

public class DataProviders {
	
	public String[][] getData()
	{
		String path = "./AutomationFramework1/testData/AccountLogin.xlsx";
		
		ExcelUtility xlutil = new ExcelUtility(path); //creating object for XLutility
		
		int totalrows = xlutil.getRowcount("Sheet");
		int totoalcols = xlutil.getCellCount("Sheet1",i,j);
		
		String logindata[][] = new String[totalrows][totalcols];
		
		for
		
		
		
		return null;
		
	}

}
