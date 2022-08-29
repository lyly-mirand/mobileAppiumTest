package ru.gb.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static ru.gb.LoginTest.PASSWORD;

public class LoginPage {

    SelenideElement inputPassword = $(MobileBy.AccessibilityId("input-password"));
    SelenideElement menuLoginButton = $(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView"));

    SelenideElement ErrorText = $(MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]"));

    public LoginPage LoginPageClick(){
        menuLoginButton.click();
        return this;
    }
    public LoginPage inputPassword(String pswd){
        //inputPassword.click();
        inputPassword.setValue(pswd);
        return this;
    }
    public LoginPage checkErrorText(String text){
        Assert.assertEquals(ErrorText.getText(),text);
        return this;
    }






//MobileElement inputPassword = (MobileElement) driver.findElementByAccessibilityId("input-password");
////        inputPassword.click();

    //MobileElement inputPassword = (MobileElement) driver.findElementByAccessibilityId("input-password");
//        inputPassword.click();
//        inputPassword.sendKeys(PASSWORD);
//        Thread.sleep(5000);
//        MobileElement menuLoginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup/android.widget.TextView");
//        menuLoginButton.click();
//        Thread.sleep(5000);
//        MobileElement ErrorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
//        Assert.assertEquals(ErrorText.getText(), TEXT);
}
