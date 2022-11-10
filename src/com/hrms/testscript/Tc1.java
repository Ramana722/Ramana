package com.hrms.testscript;
import org.apache.log4j.xml.DOMConfigurator; 
import org.testng.annotations.Test;
import com.hrms.lib.General1;
public class Tc1{
	@Test
	public void Tc1()  {
	//test case steps 
		DOMConfigurator.configure("log4j.xml"); 
		General1 obj = new General1();
	obj.openApplication(); 
	obj.login();
	obj.logout(); 
	obj.closeApplication();
	}
	}



