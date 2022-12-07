package foxapp.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class guestPlaceOrderStepDef {

	private WebDriver driver;

	 public void waitfor(long time) {
		  try {
		      Thread.sleep(time);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
		  }
	 }
	  
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
	    
		  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();     
	      driver.manage().window().maximize();
	      driver.get("https://askomdch.com/store");
		
	}

	@Given("my billing details are")
	public void my_billing_details_are() {
		
		
	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() {
		
		 By addToCartBtn = By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
	     driver.findElement(addToCartBtn).click();
	     waitfor(4000);
	     By viewCartLink = By.xpath("//a[@title='View cart']");
	     driver.findElement(viewCartLink).click();
	     waitfor(4000);
	   
	}

	@Given("I'm on the Checkout page")
	public void i_m_on_the_checkout_page() {
	 
		By proceedToChkOutBtn = By.xpath("//a[contains(text(), 'Proceed to checkout')]");
		driver.findElement(proceedToChkOutBtn).click();
		
	}

	@When("I provide billing details")
	public void i_provide_billing_details(DataTable dataTable) {
		
		List<Map<String, String>> billingDetails = dataTable.asMaps();
	   
		  By firstName = By.xpath("//input[@id='billing_first_name']");
		  By lastName = By.xpath("//input[@id='billing_last_name']");
		  By country = By.xpath("(//span[text()='United States (US)'])[1]");
		  By address_line1 = By.xpath("//input[@id='billing_address_1']");
		  By city = By.xpath("//input[@name='billing_city']");
		  By billingstateDropdown = By.xpath("//select[@id='billing_state']");

		  
		  By zip = By.xpath("//input[@id='billing_postcode']");
		  By email = By.xpath("//input[@id='billing_email']");

		  driver.findElement(firstName).clear();
		  driver.findElement(firstName).sendKeys(billingDetails.get(0).get("firstname"));
		  
		  driver.findElement(lastName).clear();
		  driver.findElement(lastName).sendKeys(billingDetails.get(0).get("lastname"));

		  //driver.findElement(country).clear();
		  driver.findElement(country).click();

		  driver.findElement(address_line1).click();
		  driver.findElement(address_line1).clear();
		  driver.findElement(address_line1).sendKeys(billingDetails.get(0).get("address_line1"));

		  driver.findElement(city).clear();
		  driver.findElement(city).sendKeys(billingDetails.get(0).get("city"));
		  

		  driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
		  waitfor(2000);
		  
		  By selectbillingstateDropdown = By.xpath("//select[@id='billing_state']/option[text()='"+billingDetails.get(0).get("state")+"']");
		  driver.findElement(selectbillingstateDropdown).click();
		  waitfor(2000);
		  driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
		  waitfor(2000);
		  
		  driver.findElement(zip).clear();
		  driver.findElement(zip).sendKeys(billingDetails.get(0).get("zip"));
		  
		  driver.findElement(email).clear();
		  driver.findElement(email).sendKeys(billingDetails.get(0).get("email"));
		  
	
	}

	@When("I place an order")
	public void i_place_an_order() {
	    
		//WebElement placeorderbtn =driver.findElement(By.xpath("//button[@id='place_order']"));
		//placeorderbtn.click();
		waitfor(2000);
		By placeorderbtn = By.xpath("//button[@id='place_order']");
		driver.findElement(placeorderbtn).click();
		
		waitfor(6000);
		
		
		
		
	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
	  
		By validateOrderPlacedmsg = By.xpath("//p[text()='Thank you. Your order has been received.']");
	    boolean ordermsgdisplay =driver.findElement(validateOrderPlacedmsg).isDisplayed();
	    Assert.assertEquals(true, ordermsgdisplay);
	}
	
}
