import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    public static final String TEXT = "Please enter a valid email address";
    public static final String PASSWORD = "123456";

    @Test
    public void checkEmptyemail() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformVertion", "11");
        capabilities.setCapability("app", "C:\\Users\\ea_samigullaeva\\Downloads\\Android-NativeDemoApp-0.2.1.apk");


        MobileDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);


        MobileElement menuLogin = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
        menuLogin.click();
        Thread.sleep(5000);
        MobileElement inputPassword = (MobileElement) driver.findElementByAccessibilityId("input-password");
        inputPassword.click();
        inputPassword.sendKeys(PASSWORD);
        Thread.sleep(5000);
        MobileElement menuLoginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView");
        menuLoginButton.click();
        Thread.sleep(5000);
        MobileElement ErrorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
        Assert.assertEquals(ErrorText.getText(),TEXT);

    }
}
