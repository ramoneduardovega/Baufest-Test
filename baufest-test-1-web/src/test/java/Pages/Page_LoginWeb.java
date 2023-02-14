package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Page_Base;

public class Page_LoginWeb extends Page_Base{
	
	By loginLinkLocator = By.linkText("Log in");
	By userLocator = By.id("loginusername");
	By passLocator = By.id("loginpassword");
	By signInBtnLocator = By.className("btn btn-primary");
	By homePageLocator = By.id("nameofuser");
	
	public void signIn() throws InterruptedException {		
		click(loginLinkLocator);
		Thread.sleep(2000);
		
		if(isDisplayed(userLocator)) {
			type("baufest01",userLocator);
			type("baufest01",passLocator);
			click(signInBtnLocator);
			
		} else {
			System.out.println("Username textbox was not present");
		}
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
		
	}

}
