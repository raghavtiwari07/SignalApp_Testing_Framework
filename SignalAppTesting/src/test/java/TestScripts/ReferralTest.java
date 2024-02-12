package TestScripts;

import core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * ReferralTest class represents a test script for referring friends in the application.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class ReferralTest extends BaseTest {

    /**
     * Constructor for ReferralTest class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public ReferralTest() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for referring friends.
     * @throws InterruptedException If any thread is interrupted during sleep.
     */
    public void runTest() throws InterruptedException {
        try {
            // Find and click on the my profile button
            WebElement myProfileButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/toolbar_icon")));
            myProfileButton.click();
            System.out.println("Clicked on the my profile button");

            // Wait for the profile page to load
            Thread.sleep(3000);

            // Scroll vertically downwards until the specified element is found
            while (!driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id='org.thoughtcrime.securesms:id/title' and @text='Invite your friends']")).isDisplayed()) {
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
            }
            System.out.println("Scrolled to 'Invite your friends'");

            // Click on the 'Invite your friends' button
            WebElement inviteFriendsButton = driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id='org.thoughtcrime.securesms:id/title' and @text='Invite your friends']"));
            inviteFriendsButton.click();
            System.out.println("Clicked on the 'Invite your friends' button");

            // Wait for the invite options to appear
            Thread.sleep(3000);

            // Find and click on the share button
            WebElement shareButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/share_button")));
            shareButton.click();
            System.out.println("Clicked on the share button");

            // Wait for the share options to appear
            Thread.sleep(3000);

            // Verify that the share options are visible
            assert driver.findElement(MobileBy.id("org.thoughtcrime.securesms:id/share_list")).isDisplayed();
            System.out.println("Verified that the share options are visible");

        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
