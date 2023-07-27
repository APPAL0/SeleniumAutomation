package seleniumIDEExample;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		
		
		
		//app1
		//chromedriver path
		//System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe"); // ------ browserversion 114, driverVersion: 114
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\Downloads\\chromedriver_win32_100\\chromedriver.exe");
		
		
		//app2
//		WebDriverManager.chromedriver().setup();    //version --- below 5.0.0
//		driver = new ChromeDriver();
		
		
		//app3 ---- above 5.0.0
		driver = WebDriverManager.chromedriver().create(); 
		
		
		
		//driver = new ChromeDriver();
		
		
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void sampleTest() throws Exception {
		
		//sync issues ----
		
		Thread.sleep(4000);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".oxd-button--ghost")).click();
		Thread.sleep(4000);
	}
}