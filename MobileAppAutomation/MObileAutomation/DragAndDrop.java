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
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

@Test
public class DragAndDrop extends BaseTest
{
	
   public void DragAndDropAction() throws MalformedURLException, InterruptedException{
	   
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
