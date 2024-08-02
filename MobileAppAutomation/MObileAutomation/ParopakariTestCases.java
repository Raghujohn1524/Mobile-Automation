package MobileAppAutomation.MObileAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ParopakariTestCases extends BaseTest {
     @Test
	public void Userlogin() throws InterruptedException {
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//android.webkit.WebView[@text=\"India's only expenseless, direct crowdfunding platform\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View")).click();
		//driver.findElement(By.xpath("//android.webkit.WebView[@text=\"India's only expenseless, direct crowdfunding platform\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View")).click();
		//driver.findElement(By.xpath("(//android.view.View)[0]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"LOGIN\"]")).click();
		Thread.sleep(2000);
//		Set <String> Context = driver.getContextHandles();
//		for(String ContexName : Context)
//		{}
//			System.out.println("Contax name is "+ContexName);
		driver.findElement(By.xpath("//android.webkit.WebView[@text=\"India's only expenseless, direct crowdfunding platform\"]/android.view.View/android.view.View"
				+ "/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]"
				+ "/android.widget.EditText")).sendKeys("8870581524");
        driver.findElement(By.xpath("//android.webkit.WebView[@text=\"India's only expenseless, direct crowdfunding platform\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/"
        		+ "android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("Raghu@123");
        //Waiting for captcha entry
        Thread.sleep(12000);
        driver.hideKeyboard();
        
        driver.findElement(By.xpath("//android.widget.Button[@text=\"LOGIN\"]")).click();
        
        
		
	}
	
}
