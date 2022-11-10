package com.hrms.testscript;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;


import com.hrms.lib.First_Lastname;

public class TC__2 {
	@Test
	public void TC003() {
	DOMConfigurator.configure("log4j.xml");
	First_Lastname obj = new First_Lastname();
	obj.openApplication();
	obj.login();
	obj.addemployee();
	obj.logout();
	obj.closeApplication();
	}
}
