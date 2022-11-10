package com.hrms.lib;
import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;


public class General extends Global{
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Selenium.drives&jar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application is opened");
		
		
		
	}
    public void closeApplication() {
    	driver.quit();
    	System.out.println("Application is closed");
    	
    	
    	
    }
    public void login(){
    	driver.findElement(By.name(txt_loginname)).sendKeys(name);
    	driver.findElement(By.name(txt_password)).sendKeys(password);
    	driver.findElement(By.name(btn_login)).click();
    	System.out.println("Login is completed");
    	
    }
    public void logout() {
    	driver.findElement(By.linkText(link_logout)).click();
    	System.out.println("Logout is completed");
    	
    }
	

}
