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
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@Test
public class GetCurrentPage extends BaseTest
{
	// To get current page
   public void GetActivityAndPackage() throws MalformedURLException, URISyntaxException, InterruptedException{
	   
	   Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.app.AlertDialogSamples");
	   ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
	            "intent","io.appium.android.apis/io.appium.android.apis.app.AlertDialogSamples"  ));
	   
	   startActivity("io.appium.android.apis", "io.appium.android.apis.app.AlertDialogSamples");
	   
	   Thread.sleep(3000);

   }
  
       
   }
   
   

