//https://www.youtube.com/watch?v=WVteFkSqvTw
package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps2 {
	
	WebDriver driver = null;

	@Given("user is on login page2")
	public void setUp() {
		
		System.out.println("user is inside set up-2");
		
//	if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
//			
//			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Project\\MyFirstCucumberJavaProject\\chromedriver.exe");
//			driver = new ChromeDriver();
//			
//		}
//		
	}

	@When("user enters username and password2")
	public void enterUsernamePwd(){

		System.out.println("user is inside username and password-2");
		//driver.get(System.getProperty("url"));
	}

	@And("clicks on login button2")
	public void clickLogin() {

		System.out.println("user is inside login click-2");
	}

	@Then("user is navigated to home page2")

	public void homePageNav() {

		System.out.println("user is inside home page navigation-2");
	}
}
