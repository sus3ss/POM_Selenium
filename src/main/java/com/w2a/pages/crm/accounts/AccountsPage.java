package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {
	public CreateAccountPage gotoCreateAccounts() {
		Page.driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		return new CreateAccountPage();
	}
    public void gotoImportAccounts() {
    	
    }
}
	