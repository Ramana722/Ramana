package com.hrms.lib;
import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class EditGeneral extends EditGlobal {
public void OpenApplication(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium.drives&jar\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	System.out.println("Application is opened");
	
}
public void closeApplication() {
	driver.quit();
	System.out.println("Application is closed");
	
	
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(name);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login is completed");
	
}
public void addemployee() {
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	driver.findElement(By.name(EFN)).sendKeys("Venkata");
	driver.findElement(By.name(ELN)).sendKeys("Ramana naidu");
	driver.findElement(By.xpath("//input[@class='savebutton']")).click();
	driver.findElement(By.xpath("//input[@class='editbutton']")).click();
	
	driver.findElement(By.name("txtEmpFirstName")).clear();
	driver.findElement(By.name(firstname)).sendKeys("Ramana");
	driver.findElement(By.name("txtEmpLastName")).clear();
	driver.findElement(By.name(lastname)).sendKeys("kusuma");
	driver.findElement(By.name("EditMain")).click();
	System.out.println("Edit name is completed");
	
	driver.switchTo().defaultContent();
}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout is completed");
		
		
	}
	
} 


