package com.hrms.testscript;
import com.hrms.lib.EditGeneral;
public class TC003 {
	public static void main(String[] args) {
		EditGeneral obj = new EditGeneral();
		obj.OpenApplication();
		obj.login();
		obj.addemployee();
		obj.logout();
		obj.closeApplication();
	}

}
