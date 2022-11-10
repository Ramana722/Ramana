package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	public WebDriver driver;
	//Test Data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String name = "nareshit";
	public String password ="nareshit";
	//Test object
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";

}
