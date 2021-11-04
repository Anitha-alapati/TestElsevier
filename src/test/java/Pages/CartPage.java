package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	
	By SumDress1 = By.xpath("(//img[@title=\"Faded Short Sleeve T-shirts\"])[1]");
	By AddToCart1 = By.xpath("(//a[@title=\"Add to cart\"])[1]");	
	By SumDress2 = By.xpath("(//img[@title='Blouse'])[1]");
	By AddToCart2 = By.xpath("(//a[@title=\"Add to cart\"])[2]");	
	By countShopping = By.xpath("//span[@title=\"Continue shopping\"]");	
	By HomeCheckOut = By.xpath("//span[contains(text(), 'Proceed to checkout')]");
	By ProductOk = By.xpath("//i[@class='icon-ok']");
	By FinalCheckOut = By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]");
	By SignIn = By.xpath("//span[contains(text(), 'Sign in')]");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void NavigatetoURL(String sURL) {
		driver.get(sURL);
		driver.manage().window().maximize();	
	}
	
	public void addSummerCollectionToCart() throws InterruptedException {
		
		WebElement summDress1 = driver.findElement(SumDress1);
		Actions actionaddDress1 = new Actions(driver);
		actionaddDress1.moveToElement(summDress1).build().perform();
		driver.findElement(AddToCart1).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(countShopping));
		
		driver.findElement(countShopping).click();
		
		WebElement summDress2 = driver.findElement(SumDress2);
		Actions actionaddDress2 = new Actions(driver);
		actionaddDress2.moveToElement(summDress2).build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(AddToCart2));
		driver.findElement(AddToCart2).click();
		
		
	}
	
	public void proceedToCheckOut() throws InterruptedException {
		
		driver.findElement(ProductOk);
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(HomeCheckOut));
		driver.findElement(HomeCheckOut).click();
		
	}
	
	public void finalCheckOut() {		
		driver.findElement(FinalCheckOut).click();	
	}
	
	public void signInSection() {
		driver.findElement(SignIn).isDisplayed();
	}

}
