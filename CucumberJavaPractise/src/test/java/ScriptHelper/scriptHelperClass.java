package ScriptHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class scriptHelperClass {

	
	WebDriver driver;
	By login = By.xpath("//div");

	public scriptHelperClass(WebDriver driver) {
	this.driver=driver;
	}

	
	public void checkLoginCLass(String username, String password) {
		
		driver.findElement(login).getTagName();
		
	}
	
}
