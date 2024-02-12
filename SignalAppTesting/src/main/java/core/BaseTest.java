package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * BaseTest class serves as the foundation for all test classes in the framework.
 * It initializes the AndroidDriver and WebDriverWait objects for test execution.
 */
public class BaseTest {
    protected AndroidDriver driver; // AndroidDriver object for interacting with the Android application
    protected WebDriverWait wait;   // WebDriverWait object for waiting for elements in the application

    /**
     * Constructor for BaseTest class.
     * Initializes the AndroidDriver and WebDriverWait objects with default capabilities.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public BaseTest() throws MalformedURLException {
        // Set desired capabilities for the AndroidDriver
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "MyMobile_Pixel3A");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("automationName", "UiAutomator2");

        // Initialize AndroidDriver with the specified capabilities
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        
        // Initialize WebDriverWait with the AndroidDriver and a timeout of 10 seconds
        wait = new WebDriverWait(driver, 10);
    }

    /**
     * Method to perform cleanup after test execution.
     * Quits the AndroidDriver instance if it's not null.
     */
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
