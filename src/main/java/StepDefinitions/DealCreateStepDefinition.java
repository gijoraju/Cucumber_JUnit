package StepDefinitions;

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
	public void user_enters_username_and_password(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();  
	}

	@Then("^user is on Homepage$")
	public void user_is_on_Homepage(){
		System.out.println("The user is on home page");
		
	}

	@Then("^user clicks on deals$")
	public void user_clicks_on_deals()  {
	   
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	}

	@Then("^user clicks on new$")
	public void user_clicks_on_new() {
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']//i[@class='edit icon']")).click();
	   
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^clicks on save$")
	public void clicks_on_save(){
	    
	}


}
