package com.hrms.testscript;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.EditGeneral;

public class TC__3 {
	@Test
	public void tc002() {
	    //Test Steps
		DOMConfigurator.configure("log4j.xml");
	  EditGeneral obj = new EditGeneral();
	  
	  obj.OpenApplication();
	  obj.login();
	  obj.addemployee();
	  obj.logout();
	  obj.closeApplication();
	}

}
