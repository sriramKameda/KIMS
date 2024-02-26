package com.baseYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInitYasasiiWeb {
	public static Actions act;
	protected static WebDriver driver;
	//public String URL ="https://10.10.10.2:8089/";
	public String URL ="http://192.168.1.114/login";
    //public String URL ="http://10.10.20.96/";
	//public String URL ="https://kamedahomecare.in:6070/";
	
	
	public PageFactoryInitYasasiiWeb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		
		
	}

}
