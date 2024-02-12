package TestScripts;

import core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * DeleteNotificationProfile class represents a test script for deleting a notification profile in the application.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class DeleteNotificationProfile extends BaseTest {

    /**
     * Constructor for DeleteNotificationProfile class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public DeleteNotificationProfile() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for deleting a notification profile.
     * @throws InterruptedException If any thread is interrupted during sleep.
     */
    public void runTest() throws InterruptedException {
        try {
            // Find and click on the three dots button
            WebElement threeDotsButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("More options")));
            threeDotsButton.click();
            System.out.println("Clicked on the three dots button");

            // Wait for the options to appear
            Thread.sleep(5000);

            // Find and click on the notification profile button
            WebElement notificationProfileButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Notification profile\")")));
            notificationProfileButton.click();
            System.out.println("Clicked on the notification profile button");

            // Wait for the arrow to be clickable
            WebElement arrowButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/notification_preference_chevron")));
            arrowButton.click();
            System.out.println("Clicked on the arrow in current notification profile button");

            // Wait for the setting button to be clickable
            WebElement settingButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/notification_preference_view_settings")));
            settingButton.click();
            System.out.println("Clicked on the setting of current notification profile button");

            // Wait for the delete profile button to be clickable
            WebElement deleteProfileButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Delete profile\")")));
            deleteProfileButton.click();
            System.out.println("Clicked on the delete profile button");

            // Wait for the delete confirmation button to be clickable
            WebElement deleteConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("android:id/button1")));
            deleteConfirmButton.click();
            System.out.println("Clicked on the delete button");
        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
