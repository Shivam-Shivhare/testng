package UtilitiesFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
	public static XSSFWorkbook wx;
	public static XSSFSheet ws;
	public static XSSFRow rx;
	public static XSSFCell xc;
	public static FileInputStream f1;
	public static int getrowcount(String filename,String sheetname) throws IOException
	{
		f1=new FileInputStream(filename);
		wx=new XSSFWorkbook(f1);
		ws=wx.getSheet(sheetname);
		int totalRow=ws.getLastRowNum()+1;
		wx.close();
		return totalRow;
	}
	public static int getcellcount(String filename,String sheetname) throws IOException
	{
		f1=new FileInputStream(filename);
		wx=new XSSFWorkbook(f1);
		ws=wx.getSheet(sheetname);
		int totalcell=ws.getRow(0).getLastCellNum();
		wx.close();
		return totalcell;
	}
	public static String getrowcout(String filename,String sheetname,int row,int cell) throws IOException
	{
		f1=new FileInputStream(filename);
		wx=new XSSFWorkbook(f1);
		ws=wx.getSheet(sheetname);
		xc=wx.getSheet(sheetname).getRow(row).getCell(cell);
		wx.close();
		return xc.getStringCellValue();
	}
	

}
