package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name ="LoginData")
	public String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir") + "\\ExcelFile1.xlsx";
		
		ExcelUtility xlutil = new ExcelUtility(path); //creating object for XLutility
		
		int totalrows = xlutil.getRowcount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1",1);
		
		String LoginData[][] = new String[totalrows][totalcols];
		
		for(int i =1;i<=totalrows;i++)
		{
			for(int j =0;j<totalcols;j++)
			{
				LoginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}
		

		return LoginData;
		
	}

}
