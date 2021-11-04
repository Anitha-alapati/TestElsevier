package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
	
public WebDriver driver;
	
    CartPage CartPage;
	public void fnLaunchBrowser() {		
		System.setProperty("webdriver.chrome.driver", "F:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();			
	}
	

	@Given("I am on the home page")
	public void i_am_on_the_home_page() throws Exception {
		fnLaunchBrowser();
		CartPage = new CartPage(driver);
		CartPage.NavigatetoURL("http://automationpractice.com/index.php/");
	}

	@When("I add a product to Cart")
	public void i_add_a_product_to_cart() throws InterruptedException {
	    CartPage = new CartPage(driver);
		CartPage.addSummerCollectionToCart();
	}

	@And("I Proceed to CheckOut")
	public void i_proceed_to_check_out() throws InterruptedException {
	    CartPage = new CartPage(driver);
		CartPage.proceedToCheckOut();
	}

	@Then("I should be able to see the SignIn Section")
	public void i_should_be_able_to_see_the_sign_in_section() {
		CartPage = new CartPage(driver);
		CartPage.finalCheckOut();
		CartPage.signInSection();
	}

}
