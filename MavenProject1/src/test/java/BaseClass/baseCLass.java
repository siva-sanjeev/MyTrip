package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import ExcelLibraries.ExcelClass;

public class baseCLass {

	
	public void readPropertyFile() {
		
			    Properties prop = new Properties();
			    InputStream input = null;

			    try {

			        input = new FileInputStream("C:\\Eclipse\\MavenProject1\\src\\test\\java\\BaseClass\\config.properties");
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
	
	
	@BeforeTest
		public static void initialiseDrivers() throws InterruptedException {
			
			System.out.println("Initialising chrome drivers");
			System. setProperty("webdriver.chrome.driver", "C:\\Eclipse\\MavenProject1\\Drivers\\chromedriver.exe");
			// Initialize browser.
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(4000);
			driver.close();
			
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
