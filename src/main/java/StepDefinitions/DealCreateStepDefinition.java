package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class DealCreateStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already in Login page$")
	public void user_is_already_in_Login_page(){
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://ui.cogmento.com/");
				    
	
	}

	@When("^user title of login page is crm$")
	public void user_title_of_login_page_is_crm(){
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
	    
		
		List<List<String>> data= credentials.raw();
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
		
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();  
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage() throws InterruptedException{
		System.out.println("The user is on home page");
		
		Thread.sleep(4000);
		
	}

	@Then("^user clicks on deals$")
	public void user_clicks_on_deals() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		Thread.sleep(4000);
	}

	@Then("^user clicks on new$")
	public void user_clicks_on_new() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Thread.sleep(4000);
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable details) throws InterruptedException {
	  
		List<List<String>> data= details.raw();
		
		
		//Title
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get(0).get(0));
		//probability
		driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data.get(0).get(1));
		//Commission
		driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data.get(0).get(2));
	    
		Thread.sleep(4000);
	}

	@Then("^clicks on save$")
	public void clicks_on_save() throws InterruptedException{
	    
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		Thread.sleep(4000);
		driver.quit();
	}


}
