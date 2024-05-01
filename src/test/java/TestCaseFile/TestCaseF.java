package TestCaseFile;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectfile.Loginclass;
import UtilitiesFile.DataDrivenTesting;

public class TestCaseF extends BaseClass
{
    @Test
    public void openBrowser()
    {
    	lp.info("login url open");
    	driver.get(url);
    	Loginclass lc=new Loginclass(driver);
    	lc.user("student");	
    	lp.info("this is username");
    	lc.pass("Password123");
    	lp.info("this is password");
    	lc.sub();
    	lp.info("this is click button");
    }
    @DataProvider(name="data")
    public String[][] getdata() throws IOException
    {
    	String filename="C:\\Users\\admin\\OneDrive\\Documents\\Book112.xlsx";
    	int row=DataDrivenTesting.getrowcount(filename, "Sheet1");
    	int cell=DataDrivenTesting.getcellcount(filename, "Sheet1");
    	String s1[][]=new String [row-1][cell];
    	for(int i=1;i<row;i++)
    	{
    		for(int j=0;j<cell;j++)
    		{
    			s1[i-1][j]=DataDrivenTesting.getrowcout(filename, "Sheet1", row, cell);
    		}
    	}
    	return s2;
    }
    

}
