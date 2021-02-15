package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) throws InterruptedException {
		
		ZohoAppPage zap=new ZohoAppPage();
		CRMHomePage chp=zap.gotoCRM();
		//zpage.gotoMails();
			
		chp.getUname();
	 	Page.menu.gotoHome();
		AccountsPage acPage=Page.menu.gotoAccounts();
	
		CreateAccountPage caPage=acPage.gotoCreateAccounts();
		
     	caPage.createAccPage(data.get("accountname"));
	}

}
