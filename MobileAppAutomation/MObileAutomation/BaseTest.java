package MobileAppAutomation.MObileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
    @BeforeTest
 
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException{
		 // Start server
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\kdpkk\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		 service.start();
	
		// Invoking emulator	 
		 UiAutomator2Options options = new UiAutomator2Options();
		 options.setDeviceName("Android11");
		 options.setApp("A://KKD_RAGHU//MObileAutomation//src//main//java//resources//ApiDemos-debug.apk");
		 //options.setApp("A://KKD_RAGHU//MObileAutomation//src//main//java//resources//Paropakari.apk");
	    driver = new AndroidDriver(new URI ("http://127.0.0.1:4723").toURL(), options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
	public void LongPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	    	    "elementId", ((RemoteWebElement) ele).getId(), "duration",2000));
}
	public void ScrollToEnd() {
		
		 boolean canScrollMore;
		    do {
		     canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    	    "left", 100,
		    	    "top", 100,
		    	    "width", 200,
		    	    "height", 200,
		    	    "direction", "down",
		    	    "percent", 3.0
		    	));
		    }while (canScrollMore);
	}
	
	public void DragAndDropAction(WebElement ele, int endY, int endX) {
	        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
	            "elementId", ((RemoteWebElement) ele).getId(),
	            "endX", endX,
	            "endY", endY
	        ));
	}
	
	public void SwipeAction(WebElement ele,String direction ) 
	{
		 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		            "elementId", ((RemoteWebElement) ele).getId(),
		            "direction", "Left",
		            "percent", 0.10
		        ));
	}
	public void ScrollToTarget() {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
	}
	public void back()
	{
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	public void Home() {
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
	//public void startActivity(String appPackage, String appActivity) {
			  
//			   ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
//			            "intent","io.appium.android.apis/io.appium.android.apis.app.AlertDialogSamples"  ));
		 public void startActivity(String appPackage, String appActivity) {
		        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
		            "intent", String.format("%s/%s", appPackage, appActivity)
		        ));
		    }

	
    @AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
	
}