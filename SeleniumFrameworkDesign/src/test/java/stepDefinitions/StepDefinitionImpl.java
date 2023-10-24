package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPage;
import pageobjects.CheckoutPage;
import pageobjects.ConfirmationPage;
import pageobjects.LandingPage;
import pageobjects.ProductCatalogue;
import testcomponents.BaseTest;

// Contains test to demonstrate cucumber
public class StepDefinitionImpl extends BaseTest{

	public LandingPage landingPage;
	public ProductCatalogue productCatalogue;
	CartPage cartPage;
	ConfirmationPage confirmationPage;
	
	@Given("I landed on the Ecommerce Page")
	public void I_landed_on_the_Ecpmmerce_page() throws IOException {
		
		landingPage = LaunchApplication();
	}
	
	// Pay attention to the regex that we are using, starting from ^ and ending with $, and place holders are (.+)
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_int_username_and_password(String userName, String password) {
		
		productCatalogue = landingPage.loginApplication(userName, password);
	}
	
	@When("^I add product (.+) to cart$")
	public void I_add_product_to_cart(String productName) {
		productCatalogue.addProductToCart("product");
	}
	
	@And("^Checkout (.+) and submit the order$")
	public void Checkout_and_submit_the_order(String productName) {
		
		cartPage = productCatalogue.goToCartPage();
		// cart page
		Assert.assertTrue(cartPage.isProductDisplayed(productName));
		CheckoutPage checkoutPage = cartPage.goToCheckoutPage();

		// Checkout page
		checkoutPage.selectCountry("india");
		confirmationPage = checkoutPage.submitOrder();
	}
	
	@Then("{string} message is displayed on confirmation page.")
	public void message_is_displayed_on_confirmation_page() {
		String confirmationMessage = confirmationPage.getConfirmationMessage();
		Assert.assertEquals(confirmationMessage, "THANKYOU FOR THE ORDER.");
		
		driver.quit();
	}
}