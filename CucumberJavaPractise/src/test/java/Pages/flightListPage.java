package Pages;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flightListPage {
	
	WebDriver driver;

	public flightListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	By tripTypeDropdown = By.xpath("//div[@class='selectDropdown make_relative']");
	By blankSpace = By.xpath("//html");

	
	public void tripTypeDropdown(String tripType) {
		
		driver.findElement(tripTypeDropdown).click();
		
		driver.findElement(By.xpath("//ul[@class='dropDownList']/li[contains(text(),'" + tripType + "')]")).click();
		
	}
	

	
	public void selectDateNextToCurrentDate() {
		
		Date dt = new Date();
		int nextDateFromCurrent = dt.getDate()+1;
		driver.findElement(By.xpath("//div[contains(@class,'weeklyFareItems')]//p[contains(text(),'" + nextDateFromCurrent +"')]"));
		
	}
	
	
public void clickOnBlankSpace() {
		
		driver.findElement(blankSpace).click();
	}
}
