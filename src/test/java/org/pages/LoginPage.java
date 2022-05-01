package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	// Without page factory
//	private WebElement getUsername() {
//		WebElement txtUsername = findElement("id", "email");
//		return txtUsername;
//	}
	
	
	
	// With page factory
	public LoginPage() {
        PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="email")
	private WebElement txtUsername;

	@FindBy(id="pass")
	WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void getLoginPage(String user, String pass) {
		
		sendKeys(getTxtUsername(), user);
		
		sendKeys(getTxtPassword(), pass);
		
		click(getBtnLogin());

	}
}
