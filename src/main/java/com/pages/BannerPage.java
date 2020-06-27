package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class BannerPage extends BasePage {

    public BannerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    private WebElement crousalIcon;


    public void clickOnCrousalIcon(){
        clickElement(crousalIcon);
    }


}
