package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	
	WebDriver driver;

	public loginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	By makeMyTripLink = By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']/span[contains(text(),'MakeMyTripô Official Site')]");
	By blankSpace = By.xpath("//html");
	By fromText = By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']");
	By toText = By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']");
	
	By from = By.xpath("//input[@type='text'][@placeholder='From']");
	By to = By.xpath("//input[@type='text'][@placeholder='To']");
	By searchButton = By.xpath("//a[text()='Search']");
	
	
	
	public void tripType(String tripType) {
		
		driver.findElement(By.xpath("//li[text()='" + tripType + "']"));
	}
	
	
	public void fromTextField(String fromPlace) throws InterruptedException {
		
		driver.findElement(fromText).click();
		Thread.sleep(1000);
		driver.findElement(from).sendKeys(fromPlace);
		driver.findElement(By.xpath("//p[contains(text(),'" + fromPlace +"')]//parent::div")).click();
		 
	}
	
	public void makeMyTripLinkToLogin() {
		
		driver.findElement(makeMyTripLink).click();
		System.out.println("clicked on the link to login page");
	}
	
	
	public void toTextField(String toPlace) throws InterruptedException {
		
//		driver.findElement(toText).click();
		Thread.sleep(1000);
		
		driver.findElement(to).sendKeys(toPlace);
		driver.findElement( By.xpath("//p[contains(text(),'" + toPlace +"')]//parent::div")).click();
		
	}
	
	
	public void clickSearchButton() {
		
		driver.findElement(searchButton).click();
		
	}
	
	public void clickOnBlankSpace() {
		
		driver.findElement(blankSpace).click();
	}
	
	

}
