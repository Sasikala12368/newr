package org.junitbase;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoJunit extends JunitBaseClass {

	public PojoJunit() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement emailText;
	
	
	@FindBy(id="password")
	private WebElement passTxt;
	
	@FindBy(id="login")
	private WebElement btnCl;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels ;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos ;
	
	@FindBy(id="adult_room")
	private WebElement adultroom ;
	
	@FindBy(id="child_room")
	private WebElement childroom ;
	
		
	@FindBy(id="Submit")
	private WebElement Submit;
	
	

	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getRoomnos() {
		return roomnos;
	}


	public WebElement getAdultroom() {
		return adultroom;
	}


	public WebElement getChildroom() {
		return childroom;
	}


	public WebElement getSubmit() {
		return Submit;
	}


	public WebElement getBtnCl() {
		return btnCl;
	}


	public WebElement getEmailText() {
		return emailText;
	}


	public WebElement getPassTxt() {
		return passTxt;
	}
	


}
