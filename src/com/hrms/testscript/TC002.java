package com.hrms.testscript;
import com.hrms.lib.First_Lastname;
public class TC002 {
	public static void main(String[] args) {
		
	
	First_Lastname obj = new First_Lastname();
	obj.openApplication();
	obj.login();
	obj.addemployee();
	obj.logout();
	obj.closeApplication();

}
}