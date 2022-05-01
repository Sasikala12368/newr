package org.junitbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JunitBaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	public static void window() {
		driver.manage().window().maximize();
		
	}
	
	public static void select(WebElement ref,int inum) {
		Select s=new Select(ref);
		s.selectByIndex(inum);
	}
	public static void launchUrl (String url) {
	driver.get(url);
	}
	
	public static void fillText(WebElement ref,String value  )  {
		ref.sendKeys(value);
	}
	
	public static void click(WebElement ref) throws IOException {
		ref.click();
	}
	public static String readFromExcel(int row,int col) throws IOException {
		
		File f= new File("D:\\Sofware\\wokplace\\MavenJunit\\Excel\\data.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		 Sheet sheet = book.getSheetAt(0);
		 Row row2 = sheet.getRow(row);
		 Cell cell = row2.getCell(0);
		 int cellType = cell.getCellType();
		 String cellValue="";
		 if(cellType==1) {
			  cellValue = cell.getStringCellValue();
		 }
		 else if(DateUtil.isCellDateFormatted(cell))
		 {
			  cellValue = cell.getStringCellValue();
		 }
		 
		
		 else {
			 
			 double val = cell.getNumericCellValue();
			 long l=(long)val;
			  cellValue = String.valueOf(l);
		 }
		 return cellValue;
	}
	public static String toGetatt(WebElement ref) {
		
		String attribute = ref.getAttribute("value");
		
		return attribute;
		
		

	} 
		
	public static void writeToExcel(int row,int col,WebElement ref) throws IOException {
		File f= new File("D:\\Sofware\\wokplace\\Mavan\\excel\\pome.xlsx");
		FileInputStream fIn=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fIn);
		Sheet sheet = book.getSheetAt(0);
		
		Row row2 = sheet.getRow(row);
		Cell createCell = row2.createCell(col);
		String val = ref.getAttribute("value");
		
		
		System.out.println(val);
		createCell.setCellValue(val);
		
		FileOutputStream fout =new FileOutputStream(f);
		book.write(fout);
		
		
		
	}
	


}
