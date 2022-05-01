package org.test;

import org.base.BaseClass;
import org.pages.LoginPage;

public class FacebookLogin extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		maximize();
		implicitlyWait(20);
		
		LoginPage l=new LoginPage();
		l.getLoginPage("raja", "Raja@123");
		
		Thread.sleep(5000);
		quit();
	}

}
