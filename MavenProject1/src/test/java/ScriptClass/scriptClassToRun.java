package ScriptClass;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.baseCLass;

public class scriptClassToRun extends baseCLass{
	
	
	 @Test(dataProvider = "LoginData")
	  public void integrationTest(Map<Object, Object> map) {
	    System.out.println("-------------Test case started ----------------");
	    System.out.println(map.get("userName"));
	    System.out.println(map.get("Password"));
	    System.out.println("-------------Test case Ended ----------------");
	  }
	 
	 @Test
	  public void integrationTest1() {
	    System.out.println("-------------Test case started ----------------");

	  }
	 
	 
	 @BeforeClass
		public static void initialiseDrivers() throws InterruptedException {
			
			System.out.println("Initialising chrome drivers");
			System. setProperty("webdriver.chrome.driver", "C:\\Eclipse\\MavenProject1\\Drivers\\chromedriver.exe");
			// Initialize browser.
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(4000);
			driver.close();
			
		}

}
