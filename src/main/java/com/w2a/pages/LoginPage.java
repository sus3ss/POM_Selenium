package com.w2a.pages;

public class LoginPage extends HomePage {
	
	public ZohoAppPage doLogin(String mailid,String pwd) throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#login_id")).sendKeys(mailid);
		type("Email_CSS","mailid");
		//driver.findElement(By.cssSelector("#nextbtn")).click();
		click("Nextbutton_CSS");
		//driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		type("Password_CSS","pwd");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//form[@id='login']/button[@id='nextbtn']")).click();
		click("Nxtbtn_XPATH");
		return new ZohoAppPage();

	}
}
