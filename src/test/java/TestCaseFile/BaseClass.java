package TestCaseFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import UtilitiesFile.Readconfig;

public class BaseClass {

	public static WebDriver driver;
	Logger lp;
	Readconfig rc=new Readconfig(); 
	String url=rc.geturl();
	String bro=rc.getbrowser();
	@BeforeClass
	void browserLunch() {
		switch(bro.toLowerCase())
		{
		case"chrome":
		driver=new ChromeDriver();
		break;
		case"msedge":
		driver=new EdgeDriver();
		break;
		case"firefox":
		driver=new FirefoxDriver();
		break;
		default:
			driver=null;
			break;
		}
		  lp=LogManager.getLogger("selenium12");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	public void screenshot() throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot) driver;
		File f1=sc.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\admin\\eclipse-workspace\\selenium12\\ConfigutionsFile\\ScreenShot\\sh.png");
		FileUtils.copyFile(f1, f2);
	}
	@AfterClass
	public void closeup()
	{
		driver.close();
		driver.quit();
	}
	
}
