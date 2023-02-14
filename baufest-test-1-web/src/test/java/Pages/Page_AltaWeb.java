package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Page_Base;


public class Page_AltaWeb extends Page_Base{
	
	By registerLinkLocator = By.linkText("Sign up");
	By registerWindowLocator = By.id("signInModalLabel");
	By usernameLocator = By.id("sign-username");
	By passwordLocator = By.id("sign-password");
	By registerBtnLocator = By.className("btn btn-primary");
	
	public void isHomePage() throws InterruptedException{
	
		//	
	}
	
	public void clickMenukSignUp() throws InterruptedException{
		
		//	
	}
	public void introduceUserPass() throws InterruptedException{
		
		//	
	}
	public void clickButtonSignUp() throws InterruptedException{
		
		//	
	}
	
	public void createUser() throws InterruptedException{
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerWindowLocator)) {
			type("baufest01",usernameLocator);
			type("baufest01",passwordLocator);
			
			click(registerBtnLocator);
			quit();
			
		} else {
			System.out.println("Register page was not found");
		}
		
	}
	
	public String registeredMessage() {
		return "";
	}

	
}
