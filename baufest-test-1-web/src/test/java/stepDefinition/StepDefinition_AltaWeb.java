package stepDefinition;

import Pages.Page_AltaWeb;

import org.openqa.selenium.WebDriver;

import Pages.Page_AltaWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.Page_Base;

public class StepDefinition_AltaWeb{

	Page_AltaWeb Page_AltaWeb = new Page_AltaWeb();
	
	@Given("el usuario está en el HomePage de la tienda online")
	public void estaEnHomePage() throws InterruptedException {
		Page_AltaWeb.isHomePage();
	}
	
	@When("el usuario clica en el menu Sign up")
	public void clicaMenuSignUp() throws InterruptedException {
		Page_AltaWeb.clickMenukSignUp();
	}
	
	@And("el usuario introduce de forma correcta su username y password")
	public void introduceCredenciales() throws InterruptedException {
		Page_AltaWeb.introduceUserPass();
	}
	
	@And("el usuario clica sobre el botón Sign up")
	public void clicaBotonSignUp() throws InterruptedException {
		Page_AltaWeb.clickButtonSignUp();
	}
	
	@Then("se crea una cuenta en la tienda online")
	public void creaUsuario() throws InterruptedException {
		Page_AltaWeb.createUser();
	}
	
}
