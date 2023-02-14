package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Page_Base;

public class Page_AddCartWeb extends Page_Base{
	
	By homePageLocator = By.id("nameofuser");
	By laptopsLinkLocator = By.id("itemc");
	By articleLinkLocator = By.linkText("Sony vaio i5");
	By AddBtnLocator = By.className("btn btn-success btn-lg");	
	By cartLinkLocator = By.linkText("Cart");

	
	public void addCartWeb() throws InterruptedException {		
		
		if(isDisplayed(homePageLocator)) {
			
			click(laptopsLinkLocator);
			Thread.sleep(2000);
			click(articleLinkLocator);
			Thread.sleep(2000);
			click(AddBtnLocator);
			Thread.sleep(2000);
			click(cartLinkLocator);
			Thread.sleep(2000);
			
		} else {
			System.out.println("User is not logged in");
		}
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator);
		
	}

}
