package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    private WebElement btnsignup;

    public void enterUserName(String text){
        wait.until(ExpectedConditions.visibilityOf(username));
        writeText(username,text);
    }
    public void enterPassword(String text){
        wait.until(ExpectedConditions.visibilityOf(password));
        writeText(password,text);
    }

    public void setBtnsignup(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement(btnsignup);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
