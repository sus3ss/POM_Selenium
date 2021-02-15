package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccountPage extends Page {
	public void createAccPage(String AccountName) {
		//Page.driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(AccountName);
	    type("AccountName_CSS","accountname");
	
	}

}
