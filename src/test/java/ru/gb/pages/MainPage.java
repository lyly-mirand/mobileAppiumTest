package ru.gb.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    //MobileElement menuLogin = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
    SelenideElement menuLogin = $(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView"));

    public LoginPage clickMenuLogin(){
          menuLogin.click();
          return new LoginPage();
      }

}
