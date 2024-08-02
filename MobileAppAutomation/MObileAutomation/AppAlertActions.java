package MobileAppAutomation.MObileAutomation;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@Test
public class AppAlertActions extends BaseTest
{
	
   public void NameSetting() throws MalformedURLException, URISyntaxException, InterruptedException{

	
	driver.findElement(AppiumBy.accessibilityId("App")).click();
	driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	String poptext = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals("Text Entry dialog", poptext);
	driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("Raghuaman");
	driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("Raghu@123");
	driver.findElement(By.id("android:id/button1")).click();
	back();
	Home();

   }
  
       
   }
   
   

