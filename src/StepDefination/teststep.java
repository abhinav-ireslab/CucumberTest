package StepDefination;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	
	WebDriver driver;
	
	@Given("^open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");	
		driver= new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://patientengagementdemo.azurewebsites.net/");
		
	}
	
	@When("^Enter valid \"(.*?)\" and valid \"(.*?)\"$")
	 public void i_enter_valid_username_and_valid_password(String uname, String pass)
	 {
		driver.findElement(By.id("UserName")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pass);
	}
	

	@Then("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
	    
		driver.findElement(By.id("LoginSubmit")).click();
	}
	

	/*@Then("^click on patient Tab$")
	public void click_on_patient_Tab() throws Throwable {
	    
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".col-sm-4 patient-tab")).click();
	}*/

}
