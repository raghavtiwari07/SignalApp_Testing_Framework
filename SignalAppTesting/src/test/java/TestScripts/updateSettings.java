package TestScripts;

import core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

/**
 * updateSettings class represents a test script for updating application settings.
 * It extends the BaseTest class to inherit common test functionalities.
 */
public class updateSettings extends BaseTest {

    /**
     * Constructor for updateSettings class.
     * Initializes the AndroidDriver and WebDriverWait objects from the BaseTest class.
     * @throws MalformedURLException If the URL for Appium server is invalid.
     */
    public updateSettings() throws MalformedURLException {
        super();
    }

    /**
     * Method to execute the test script for updating application settings.
     * @throws InterruptedException If any thread is interrupted during sleep.
     */
    public void runTest() throws InterruptedException {
        try {
            // Find and click on the My account button
            WebElement myAccountButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/toolbar_icon")));
            myAccountButton.click();
            System.out.println("Clicked on the My account button");

            // Wait for the account page to load
            Thread.sleep(5000);

            // Click on the Appearance button
            WebElement appearanceButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[@text='Appearance']")));
            appearanceButton.click();
            System.out.println("Clicked on the Appearance button");

            // Wait for the Appearance page to load
            Thread.sleep(5000);

            // Click on the Theme button
            WebElement themeButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.TextView[@text='Theme']")));
            themeButton.click();
            System.out.println("Clicked on the Theme button");

            // Wait for the Theme page to load
            Thread.sleep(5000);

            // Click on the Dark theme option
            WebElement darkThemeOption = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.CheckedTextView[@text='Dark']")));
            darkThemeOption.click();
            System.out.println("Clicked on the Dark theme option");

            // Wait for the theme to change
            Thread.sleep(5000);

            // Click on the Chat color button
            WebElement chatColorButton = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("org.thoughtcrime.securesms:id/chat_wallpaper_set_chat_color")));
            chatColorButton.click();
            System.out.println("Clicked on the Chat color button");

            // Wait for the Chat color options to load
            Thread.sleep(5000);

            // Click on the Red color option
            WebElement redColorOption = wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//android.widget.ImageView[@resource-id='org.thoughtcrime.securesms:id/chat_color'])[3]")));
            redColorOption.click();
            System.out.println("Clicked on the Red color option");

            // Wait for the chat color to change to red
            Thread.sleep(5000);

            // Verify that the chat color has changed to red
            WebElement chatColor = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("org.thoughtcrime.securesms:id/chat_color")));
            assert chatColor.getAttribute("color").equals("red");
            System.out.println("Verified that the chat color has changed to red");
        } finally {
            tearDown(); // Clean up after test execution
        }
    }
}
