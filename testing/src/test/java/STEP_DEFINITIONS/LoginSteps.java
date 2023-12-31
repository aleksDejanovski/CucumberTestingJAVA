package STEP_DEFINITIONS;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Testing123\\testing\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(34,TimeUnit.SECONDS);
		driver.get("https://www.topshop.com.mk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".header-sign-in")).click();
driver.findElement(By.cssSelector("a[title='Најавете се']")).click();
	}

	@When("user enters username and pass")
	public void user_enters_username_and_pass() {
		driver.findElement(By.id("email")).sendKeys("denkovski112a@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("acecar");
		
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("send2")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(23);
		WebElement elementName = driver.findElement(By.className("hello"));
		Assert.assertTrue(elementName.isDisplayed());
		
		driver.close();
		driver.quit();
	}


}
