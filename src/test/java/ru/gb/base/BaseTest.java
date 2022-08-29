package ru.gb.base;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import ru.gb.pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

import static jdk.internal.net.http.common.Utils.close;

public class BaseTest {

    public MainPage openApp(){

        WebDriverRunner.setWebDriver(getAndroidDriver());

        return new MainPage();
    }
    private WebDriver getAndroidDriver(){
        MobileDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformVertion", "11");
        capabilities.setCapability("app", "C:\\Users\\ea_samigullaeva\\Downloads\\Android-NativeDemoApp-0.2.1.apk");


        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }

}
