package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends LoginPage{
	
	public CRMHomePage gotoCRM() {
		//driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		click("CRMlink_XPATH");
		return new CRMHomePage();
	}

	public void gotoMails() {
		driver.findElement(By.xpath("//div[contains(text(),'Mail')]")).click();
		
	}
}
