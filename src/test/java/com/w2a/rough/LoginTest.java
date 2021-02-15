package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HomePage hpage=new HomePage();
		LoginPage lp=hpage.goToLogin();
		ZohoAppPage zap=lp.doLogin("sushanth.uv@gmail.com", "aditI@123");
		CRMHomePage chp=zap.gotoCRM();
		//zpage.gotoMails();
			
		chp.getUname();
	 	Page.menu.gotoHome();
		AccountsPage acPage=Page.menu.gotoAccounts();
	
		CreateAccountPage caPage=acPage.gotoCreateAccounts();
		
     	caPage.createAccPage("Sushanth");
		

	}

}
