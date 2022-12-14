package com.hrms.lib;
	import org.openqa.selenium.By;

	import org.openqa.selenium.chrome.ChromeDriver;
	import com.hrms.utility.log;
	public class General1 extends Global1{
	//re-fun
	public void openApplication() { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Selenium.drives&jar\\Drivers\\chromedriver_win32\\chromedriver.exe"); 
	driver = new ChromeDriver(); 
	driver.navigate().to(url); 
	System.out.println("Application Opened");
	log.info("Application Opened");
	}
	public void closeApplication() { 
		driver.quit(); 
	System.out.println("Application closed"); 
	log.info("Application closed");
	}
	public void login() { 
		driver.findElement(By.name(txt_loginname)).sendKeys(un); 
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click(); 
	System.out.println("Login completed");
	log.info("Login completed");
	}
	public void logout() { 
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed"); 
		log.info("Logout completed");
	}
	

	}

