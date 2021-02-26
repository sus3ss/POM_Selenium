package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	public void gotoSignup() {
		//driver.findElement(By.cssSelector(".zh-signup"));
		click("Signuplink_CSS");
	}
    public LoginPage goToLogin() {
    	 
    	//driver.findElement(By.cssSelector(".zh-login")).click();
    	click("Loginlink_CSS");
		return new LoginPage();
    	
    }
    public void goToSupport() {
    	
    }
    public void goToLearnMore() {
    	
    }
    
    public void validateFooterLinks() {
    	
    }
}
