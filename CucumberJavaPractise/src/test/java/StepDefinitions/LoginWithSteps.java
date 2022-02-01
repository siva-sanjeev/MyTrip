package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClasses.baseClass1;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithSteps extends baseClass1{
	
	WebDriver driver = null;
	loginPage login;
	
	
	public LoginWithSteps() throws InterruptedException, IOException {
		super();
		driver = setup();
	}
	

	@Given("User is on OLX login page")
	public void user_is_on_login_page() {
	   
		//driver.get("https://www.olx.in/en-in/electronics-appliances_c99/q-login");
		System.out.println("Inside Given steps - launched OLX login page");
		
		driver.getPageSource().contains("All Categories");
		
	}
	
	@Given("User is on MakeMyTrip login page")
	public void user_is_on_MakeMyTrip_login_page() throws InterruptedException {
	   
		login = new loginPage(driver);
		
//		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchbox.sendKeys("makemytrip");
		searchbox.sendKeys(Keys.ENTER);
		
		login.makeMyTripLinkToLogin();
		Thread.sleep(3000);
		
	}
	
	@When("^User enter (.*) and (.*) location$")
	public void user_enters_fromAndToLocation(String From, String To) throws InterruptedException {
		
		login.clickOnBlankSpace();
		login.fromTextField(From);
		login.toTextField(To);
		
	}

	@And("User clicks Search button")
	public void user_clicks_search_button() {
	   
		login.clickOnBlankSpace();
		System.out.println("---------clicking on search button-------------");
		login.clickSearchButton();
		
	}
	

	@Then("User should get list of flight details")
	public void user_should_get_navigated_to_dashboard() {
	    
		System.out.println("Inside Then steps - user user gets navigated inside the dashboard page");
		
	}
	
	
	//scenario 2-----------------------------
	@Given("User is on the page where all the flight details gets displayed")
	public void user_is_on_the_page_where_all_the_flight_details_gets_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks on TripType")
	public void user_clicks_on_trip_type() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("Select TripType with data in excel at {string}")
	public void select_trip_type_with_data_in_excel_at(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("User should get flight details according to the selected \"TripType'")
	public void user_should_get_flight_details_according_to_the_selected_trip_type() {
	    // Write code here that turns the phrase above into concrete actions

	}

	
	
	//Scenario 3---------------------------------------
	@Given("User is on the page where all the flight details gets displayed based on tripType selected")
	public void user_is_on_the_page_where_all_the_flight_details_gets_displayed_based_on_tripType_selected() {
	    // Write code here that turns the phrase above into concrete actions

	}
	
	@When("User clicks on nextDate")
	public void user_clicks_on_nextDate() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("the flight details for the corresponding date should display")
	public void the_flight_details_for_the_corresponding_date_should_display() {
	    // Write code here that turns the phrase above into concrete actions

	}

	


}
