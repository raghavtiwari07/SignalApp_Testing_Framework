package TestScripts;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * AddStory class represents a test script for adding a story in the application.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class AddStory extends BaseTest {
    
    /**
     * Constructor for AddStory class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public AddStory() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for adding a story.
     * @throws InterruptedException If any thread is interrupted during sleep.
     */
    public void runTest() throws InterruptedException {
        try {
            // Find and click on the camera button
            WebElement cameraFab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("org.thoughtcrime.securesms:id/camera_fab")));
            cameraFab.click();
            System.out.println("Clicked on the camera button");

            // Wait for the camera to load
            Thread.sleep(3000);

            // Find and click on the capture button
            WebElement captureButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/camera_capture_button")));
            captureButton.click();
            System.out.println("Clicked on the capture shot button");

            // Wait for the photo to be processed
            Thread.sleep(3000);

            // Find and click on the send button
            WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/send")));
            sendButton.click();
            System.out.println("Clicked on the send button");

            // Wait for the share options to appear
            Thread.sleep(3000);

            // Find and click on the my story checkbox
            WebElement myStoryCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/check_box")));
            myStoryCheckbox.click();
            System.out.println("Clicked on the my story button");

            // Find and click on the share confirm button
            WebElement shareConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/share_confirm")));
            shareConfirmButton.click();
            System.out.println("Clicked on the send story button");

            // Wait for the photo to be shared
            Thread.sleep(3000);

            // Verify that the photo is visible in the story
            WebElement storyImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("org.thoughtcrime.securesms:id/story_image")));
            assert storyImage.isDisplayed();
            System.out.println("Photo is visible in the story");
        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
