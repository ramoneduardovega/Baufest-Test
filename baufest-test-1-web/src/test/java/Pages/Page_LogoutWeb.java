package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Page_Base;

public class Page_LogoutWeb extends Page_Base{
	
	By logoutLinkLocator = By.linkText("Log out");
	By loginLinkLocator = By.linkText("Log in");
	
	public void logOut() throws InterruptedException {		
		click(logoutLinkLocator);
		Thread.sleep(2000);		
		
	}
	
	public boolean isHomePageDisplayed() {
		
		if(isDisplayed(loginLinkLocator)) {
			return true;
			
		} else {
			return false;
		}
		
		
	}
	

}
