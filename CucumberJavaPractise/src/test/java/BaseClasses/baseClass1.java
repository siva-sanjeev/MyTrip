package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
//import cucumber.api.java.Before;
import io.cucumber.java.Before;


public class baseClass1 {

	WebDriver driver;
	
	public void readPropertyFile() {
			    Properties prop = new Properties();
			    InputStream input = null;
			    try {

			        input = new FileInputStream("C:\\Eclipse\\CucumberJavaPractise\\src\\test\\java\\BaseClasses\\config.properties");
			      // load a properties file
			        prop.load(input);
			      // get the property value and print it out
			        System.out.println(prop.getProperty("database"));
			        System.out.println(prop.getProperty("dbuser"));
			        System.out.println(prop.getProperty("dbpassword"));
			    } catch (IOException ex) {
			        ex.printStackTrace();
			        
			    } 
			   }
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
		public WebDriver setup() throws InterruptedException, IOException {
			
			System.out.println("Initialising chrome drivers");
			System. setProperty("webdriver.chrome.driver", "C:/Eclipse/CucumberJavaPractise/src/test/resources/Drivers/chromedriver.exe");
			
			// Initialize browser.
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
		//Call property file and call the url	
			Properties prop = readDataFromPropertyFile("src/test/java/BaseClasses/config.properties");
			String url = prop.getProperty("url");
			System.out.println("url from property file is passedf as :   -- " + prop.getProperty("url"));
			
			driver.get(url);
			
			return driver;
			
		}
	
	public Properties readDataFromPropertyFile(String fileName) throws IOException {
		
		FileInputStream fis = null;
	      Properties prop = null;
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	         
			return prop;
		
	}

	
	/*
	 * @AfterTest public void signOut() { System.out.println("Sign out from app"); }
	 */
	
	@AfterTest
	 public void exitDrivers() throws InterruptedException {
		 
		 driver.close();
		 driver.quit();
		 
	 }
	
	
	
//		public static void main(String[] args) throws InterruptedException, IOException {
//			
//			//baseCLass bc = new baseCLass();
//			//bc.readPropertyFile();
//			//initialiseDrivers();
//			ExcelClass ec = new ExcelClass();
//			ec.dataSupplier();
//			ec.readDataFromExcel_login();
//			
//		}
		
	}
