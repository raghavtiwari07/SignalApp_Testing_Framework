package TestScripts;

import core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * NotificationProfile class represents a test script for managing notification profiles in the application.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class NotificationProfile extends BaseTest {

    /**
     * Constructor for NotificationProfile class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public NotificationProfile() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for managing notification profiles.
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

            // Wait for the notification profile page to load
            Thread.sleep(5000);

            // Find and click on the new profile button
            WebElement newProfileButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"New profile\")")));
            newProfileButton.click();
            System.out.println("Clicked on the new profile button");

            // Wait for the new profile options to appear
            Thread.sleep(5000);

            // Find and click on the work option
            WebElement workOption = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Work\")")));
            workOption.click();
            System.out.println("Clicked on the work option");

            Thread.sleep(5000);

            // Find and click on the create button
            WebElement createButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Create\")")));
            createButton.click();
            System.out.println("Clicked on the create button");

            // Wait for the create button to finish
            Thread.sleep(5000);

            // Find and click on the next button
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Next\")")));
            nextButton.click();
            System.out.println("Clicked on the next button");

            // Wait for the next button to finish
            Thread.sleep(5000);

            // Find and click on the schedule button
            WebElement scheduleButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/edit_notification_profile_schedule_switch")));
            scheduleButton.click();
            System.out.println("Clicked on the schedule button");

            // Wait for the schedule button to toggle
            Thread.sleep(5000);

            // Find and click on the next button
            WebElement nextButton2 = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/progress_indicator")));
            nextButton2.click();
            System.out.println("Clicked on the next button");

            // Wait for the next button to finish
            Thread.sleep(5000);

            // Find and click on the done button
            WebElement doneButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/notification_profile_created_done")));
            doneButton.click();
            System.out.println("Clicked on the done button");

            // Wait for the done button to finish
            Thread.sleep(5000);

            // Verify that the notification profile has been created and updated
            WebElement notificationProfileName = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("org.thoughtcrime.securesms:id/notification_profile_name")));
            assert notificationProfileName.getText().equals("Work");
            System.out.println("Verified that the notification profile has been created and updated");
        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
