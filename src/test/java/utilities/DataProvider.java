package utilities;

import java.io.IOException;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="Logindata")
	public String[][] getData() throws IOException
	{
		String path = ".\\testData\\login_data.xlsx";
		ExcelUtility  xlutil =new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcol=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[totalrows][totalcol];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcol;j++)
			{
				logindata[i-1][j]=xlutil.getCelldata("Sheet1", i, j);
			}
		}
	
		return logindata;
	}
	

	
	}


