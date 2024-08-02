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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class TestCases extends BaseTest
{
	@Test(priority = 1)
   public void WifiSettingsName() throws MalformedURLException, URISyntaxException, InterruptedException{

	
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
	String poptext = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(poptext, "WiFi settings");
	driver.findElement(By.id("android:id/edit")).sendKeys("Raghu's Wifi");
	driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	    
	   }

@Test(priority = 2)
   public void DrogAndDropAction1() throws InterruptedException {
	//io.appium.android.apis/io.appium.android.apis.ApiDemos}
	//io.appium.android.apis/io.appium.android.apis.ApiDemos}io.appium.android.apis/io.appium.android.apis.view.InternalSelectionFocus	   
//	   Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
//	  startActivity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
	   Thread.sleep(3000);
	   driver.findElement(AppiumBy.accessibilityId("Views")).click();
	    driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	    WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	   DragAndDropAction( source,621,621);
	  
	    Thread.sleep(3000);
	    String text = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	    Assert.assertEquals("Dropped!",text);
	    System.out.println(text);
	    
	    
	   
   }
}


