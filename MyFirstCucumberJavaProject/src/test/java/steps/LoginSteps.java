//https://www.youtube.com/watch?v=WVteFkSqvTw
package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;

	@Given("user is on login page1")
	public void setUp() {

		System.out.println("user is inside set up-1");
		System.out.println("===="+System.getProperty("browser"));

		if (System.getProperty("browser").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\Project\\MyFirstCucumberJavaProject\\chromedriver.exe");
			driver = new ChromeDriver();

		}

	}

	@When("user enters username and password1")
	public void enterUsernamePwd() {

		System.out.println("user is inside username and password-1");
		driver.get(System.getProperty("url"));
		driver.findElement(By.name("q")).sendKeys("asish aravind");
		System.out.println("Google search- asish aravind ");
	}

	@And("clicks on login button1")
	public void clickLogin() {

		System.out.println("user is inside login click-1");
	}

	@Then("user is navigated to home page1")

	public void homePageNav() {

		System.out.println("user is inside home page navigation-1");
		System.out.println("new line-cucumberJava_04052021");
	}
}
