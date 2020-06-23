package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;

	
	@Given("^user is already in Login page$")
	public void user_already_on_login_page() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver = new ChromeDriver(opt);
	driver.get("https://ui.cogmento.com/");
			
	}
	
	@When("^user title of login page is makemytrip$")
	public void user_title_of_login_page_is_makemytrip() {
		
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
	  
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_username_and_password(String username, String password) throws InterruptedException {

		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);	
			
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	   	
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage()  {
	   
		System.out.println("The user is on home page");
		driver.quit();
		
	}
}
