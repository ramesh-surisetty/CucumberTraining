package foxapp.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class addToCartStepDefinitions {

	private WebDriver driver;
	 
	 public void waitfor(long time) {
	  try {
	   Thread.sleep(time);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }
	
	@Given("I'm on the store page")
	public void i_m_on_the_store_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://askomdch.com/store/");
	    driver.manage().window().maximize();
	    waitfor(5000);
	}

	@When("I add a {string} to the cart")
	public void i_add_a_to_the_cart(String product) {
	    
		 By searchProduct = By.xpath("//input[@placeholder='Search products…']");
	     //By addToCartBtn = By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
	     By searchButton = By.xpath("//button[text()='Search']");
	     By addToCartBtn = By.xpath("//button[@name='add-to-cart']");
	     By viewCart = By.xpath("(//a[@title='View your shopping cart'])[1]");
	     
	     driver.findElement(searchProduct).click();
	     driver.findElement(searchProduct).sendKeys(product);
	     driver.findElement(searchButton).click();
	     waitfor(5000);
	     
	     driver.findElement(addToCartBtn).click();
	     waitfor(3000);
	     driver.findElement(viewCart).click();
	     waitfor(3000);

		
	}

	@Then("I should see {int} {string} in the cart")
	public void i_should_see_in_the_cart(int productquantity, String product) {
		
		By productNameField = By.xpath("//tr/td[@class='product-name']/a");
		//By productNameField = By.cssSelector("td[class='product-name'] a");
		String actualProductName = driver.findElement(productNameField).getText();
		  
		By ProductQuantityField = By.xpath("//input[@type='number']");
		String actualQuantity = driver.findElement(ProductQuantityField).getAttribute("value");
		  
		Assert.assertEquals(product, actualProductName);
		Assert.assertEquals(productquantity, Integer.parseInt(actualQuantity));	
		  
	}

	
}
