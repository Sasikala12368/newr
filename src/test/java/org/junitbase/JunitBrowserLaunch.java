package org.junitbase;

import java.io.IOException;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class JunitBrowserLaunch extends PojoJunit{
	
	
		
		@BeforeClass
		public static void bfclass() {
			System.out.println("Before class Started");
			launchBrowser();
			window();
			
			launchUrl("http://www.adactin.com/HotelApp/");
			
			String currentUrl = driver.getCurrentUrl();
			
			Assert.assertEquals("check again",true,currentUrl.contains("adactin"));
			
		}
	
		@Test
		public  void test0() throws IOException, InterruptedException {
			System.out.println("Test Started");
			
			PojoJunit p=new PojoJunit();
			WebElement emailText2 = p.getEmailText();
			fillText(emailText2,"sasikalan");
			
			WebElement passTxt2 = p.getPassTxt();
			fillText(passTxt2,"88HG13");
			writeToExcel(0,0,emailText2);
			writeToExcel(1,0,passTxt2);
			
			WebElement btnCl2 = p.getBtnCl();
			click(btnCl2);
			
			System.out.println("done");
			
		}
		
			
		@Test
		public  void test2() throws IOException, InterruptedException {
	System.out.println("Test Two Started");
			
			PojoJunit p=new PojoJunit();
			
			WebElement location2 = p.getLocation();
			select(location2,2);
			
			WebElement hotels2 = p.getHotels();
			select(hotels2,2);
			
			WebElement roomtype2 = p.getRoomtype();
			select(roomtype2,1);
			
			WebElement roomnos2 = p.getRoomnos();
			select(roomnos2,2);
			
			WebElement adultroom2 = p.getAdultroom();
			select(adultroom2,2);
					
			WebElement childroom2 = p.getChildroom();
			select(childroom2,1);
			
			Thread.sleep(2000);
			writeToExcel(10,1,location2);
			writeToExcel(11,1,hotels2);
			writeToExcel(12,1,roomtype2);
			writeToExcel(13,1,roomnos2);
			writeToExcel(14,1,adultroom2);
			writeToExcel(15,1,childroom2);
			//writeToExcel(16,1,emailText2);
			//writeToExcel(17,1,emailText2);
			System.out.println("updated");
			
			WebElement submit2 = p.getSubmit();
			click(submit2);
					
					
		}
					
				
					
			
			
			
		}
