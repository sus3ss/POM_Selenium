package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;

public class CRMHomePage extends Page {
	public void getUname() {
		String showUser=driver.findElement(By.cssSelector("#show-uName")).getText();
		System.out.println(showUser);
	}

}
