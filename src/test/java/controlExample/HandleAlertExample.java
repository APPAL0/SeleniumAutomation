package controlExample;

import org.openqa.selenium.Alert;
//import org.junit.After;
//import org.junit.Before;
//import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	
	//@Test
	public void simpleAlert() throws Exception {
		
		System.out.println("Simple Alert Example");
		//Thread.sleep(4000);

		
		
		WebElement ShowMeAlertButton = driver.findElement(By.cssSelector("[value=\"Show Me Alert\"]"));
		ShowMeAlertButton.click();
		
		//handle an Alert
		//Alert/frame/windows    ------------ driver.switchTo()
		
		
		//accept() ------ click on ok button
		//dismiss()
		//sendkeys()
		//getText()
		
		
		
		Thread.sleep(4000);
		
		
		Alert SimpleAlert = driver.switchTo().alert();
		
		
		String alertText = SimpleAlert.getText();
		System.out.println("Alert TExt: " + alertText);
		//SimpleAlert.accept();
		
		SimpleAlert.dismiss();
		
		
		//validation step
		Assert.assertEquals(alertText, "Hi.. This is alert message!");				///pass the test case ---- match........ Hi.. This is alert message!
		
		
		
		
		
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	
	
	//@Test
	public void confirmAlert() throws Exception {
		
		System.out.println("Confirm Alert Example");
		//Thread.sleep(4000);

		
		
		WebElement ShowMeAlertButton = driver.findElement(By.cssSelector("[onclick=\"myFunction()\"]"));
		ShowMeAlertButton.click();
		
		//handle an Alert
		//Alert/frame/windows    ------------ driver.switchTo()
		
		
		//accept() ------ click on ok button
		//dismiss()
		//sendkeys()
		//getText()
		
		
		
		Thread.sleep(4000);
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		String alertText = confirmAlert.getText();
		System.out.println("Alert TExt: " + alertText);
		//SimpleAlert.accept();
		
		confirmAlert.dismiss();
		
		
		//validation step
		Assert.assertEquals(alertText, "Press 'OK' or 'Cancel' button!");				///pass the test case ---- match........ Hi.. This is alert message!
		
		
		
		
		
		String ok_cancel_verify = driver.findElement(By.cssSelector("[id=\"demo\"]")).getText();
		System.out.println("Validation of ok and cancel button: " + ok_cancel_verify);
		
		
		
		
		Thread.sleep(7000);
		
		
		
	}
	
	
	
	@Test
	public void promptAlert() throws Exception {
		
		System.out.println("prompt Alert Example");
		//Thread.sleep(4000);

		
		
		WebElement ShowMeAlertButton = driver.findElement(By.cssSelector("[onclick='myFunctionf()']"));
		ShowMeAlertButton.click();
		
		Thread.sleep(4000);
		
		
		//handle an alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		String alertText = promptAlert.getText();
		System.out.println("Alert TExt: " + alertText);
		
		
		
		
		promptAlert.sendKeys("Harinath");
		
		
		
		//promptAlert.dismiss();
		
		promptAlert.accept();
		
		
		//validation step
		Assert.assertEquals(alertText, "Your Name Please");				///pass the test case ---- match........ Hi.. This is alert message!
		
		
		
		
		Thread.sleep(4000);
		
		
		
	}
	
	
	

}
