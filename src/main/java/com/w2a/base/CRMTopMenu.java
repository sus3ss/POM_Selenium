package com.w2a.base;

import org.openqa.selenium.By;

import com.w2a.pages.crm.accounts.AccountsPage;

public class CRMTopMenu {
	public void gotoHome() {
		Page.driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {
    
	}

	public AccountsPage gotoAccounts() {
		Page.driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		return new AccountsPage();
	}
	public void gotoDeals() {

	}
	
	public void signOut() {
		
	}

}
