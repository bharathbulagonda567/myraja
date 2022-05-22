package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition{

	 WebDriver driver;

	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/login");
	 driver.manage().window().maximize();
	 }
	
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("ToolsQA", title);
	 }
	
	
	
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.id("userName")).sendKeys(username);
	 driver.findElement(By.id("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() throws InterruptedException {
		 Thread.sleep(10000);
	 driver.findElement(By.id("login")).click();
	 
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("ToolsQA", title);
	 }
	 
	 
	 @Then("^in home page enter search \"(.*)\"$")
	 public void enterSearchstring_on_hopme_page(String serchstring) throws InterruptedException{
		 
		 Thread.sleep(50000);
		 driver.findElement(By.id("searchBox")).sendKeys("git");
		 driver.findElement(By.id("searchBox")).sendKeys(Keys.ENTER);
		 
	
	 }
	 
	 @Then("^verify search results$")
	 public void verify_search_results() throws Throwable {
		 
		 
		 Assert.assertEquals("Git Pocket Guide", driver.findElement(By.xpath("//a[text()='Git Pocket Guide']")).getText());
	 }
		/*
		 * @Then("^user moves to new contact page$") public void
		 * user_moves_to_new_contact_page() { driver.switchTo().frame("mainpanel");
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "a[contains(text(),'Contacts')]"))).build().perform();
		 * driver.findElement(By.xpath("a[contains(text(),'New Contact')]")).click();
		 * 
		 * }
		 * 
		 * 
		 * @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
		 * public void user_enters_contacts_details(String firstname, String lastname,
		 * String position){
		 * driver.findElement(By.id("first_name")).sendKeys(firstname);
		 * driver.findElement(By.id("surname")).sendKeys(lastname);
		 * driver.findElement(By.id("company_position")).sendKeys(position);
		 * driver.findElement(By.xpath("input[@type='submit' and @value='Save']")).click
		 * (); }
		 */
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	
	
	

}
