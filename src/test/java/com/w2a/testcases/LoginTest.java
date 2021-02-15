package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.utilities.Utilities;

public class LoginTest {
	//@Test
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	
	public void loginTest(Hashtable<String, String> data) throws InterruptedException {
		//public void loginTest() throws InterruptedException 
		HomePage hpage=new HomePage();
		LoginPage lp=hpage.goToLogin();
		//ZohoAppPage zap=lp.doLogin("sushanth.uv@gmail.com", "aditI@123");
		//reading data from excel
		ZohoAppPage zap=lp.doLogin(data.get("mailid"),data.get("pwd"));
		
		
	}

}
