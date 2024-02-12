package TestScripts;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class demo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "MyMobile_Pixel3A");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cameraFab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("org.thoughtcrime.securesms:id/camera_fab")));
        cameraFab.click();
        System.out.println("Clicked on the camera button");
	}
}
