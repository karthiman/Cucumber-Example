package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("user is on Adactin Page on chrome.")
	public void user_is_on_adactin_page_on_chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter {string} and {string}.")
	public void user_enter_and(String string, String string2) throws InterruptedException {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(string);
		Thread.sleep(3000);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(string2);

	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() throws InterruptedException {
		WebElement btnlogin = driver.findElement(By.id("login"));
		Thread.sleep(3000);
		btnlogin.click();

	}

	@Then("user should validate home page screen is present.")
	public void user_should_validate_home_page_screen_is_present() {
		System.out.println("Valid Username and Password");
		driver.close();
	}

}
