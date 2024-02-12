package TestScripts;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * DeleteStory class represents a test script for deleting a story in the application.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class DeleteStory extends BaseTest {

    /**
     * Constructor for DeleteStory class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public DeleteStory() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for deleting a story.
     * @throws InterruptedException If any thread is interrupted during sleep.
     */
    public void runTest() throws InterruptedException {
        try {
            // Click on the stories button
            WebElement storiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/stories_tab_icon")));
            storiesButton.click();
            System.out.println("Clicked on the stories button");

            // Wait for the camera to load
            Thread.sleep(3000);

            // Click on the 'My Story' button
            WebElement myStoryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/story_multi")));
            myStoryButton.click();
            System.out.println("Clicked on the My Story button");

            // Wait for the photo to be processed
            Thread.sleep(3000);

            // Click on the three dots for more options
            WebElement moreOptionsButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/more")));
            moreOptionsButton.click();
            System.out.println("Clicked on the three dots");

            // Wait for the share options to appear
            Thread.sleep(3000);

            // Click on the 'Delete' button
            WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("org.thoughtcrime.securesms:id/signal_context_menu_item_title")));
            deleteButton.click();
            System.out.println("Clicked on the delete button");

            Thread.sleep(3000);

            // Click on the 'Delete for Everyone' button
            WebElement deleteForEveryoneButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            deleteForEveryoneButton.click();
            System.out.println("Clicked on the delete for everyone button");

            // Wait for the share options to appear
            Thread.sleep(3000);
        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
