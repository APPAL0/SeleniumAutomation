package headlessExample;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadConfig;

public class BaseTest_Edge {
	
	WebDriver driver;
	ReadConfig ibm_conf;

	@AfterTest
	public void closeApp() {
		
		System.out.println("closing application");
		
		
		//close the application
		driver.close();  // -------- close the current browser instance
		//driver.quit();	-------- close all the browser instance which are opened by driver
	}
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching application");
		
		
		
		
		ibm_conf = new ReadConfig();
		
		
		String appURL = ibm_conf.get_AppURL();
		System.out.println("application url from config file: " + appURL);
		
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		
		
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--headless");
		
		
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver(options);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		
		
		
		
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.get(appURL);
		Thread.sleep(4000);
		
		
	}
	
	

}
