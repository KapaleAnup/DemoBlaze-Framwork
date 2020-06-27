package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 10);
    }


    private void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element){
       waitForVisibility(element);
       try {
           if(element.isDisplayed() || element.isEnabled()) {
               element.click();
           }else {
               System.out.println("Button is not clicked");
           }
       }catch (Exception e){
           System.out.println("Error is :" + e.getStackTrace());
       }

    }

    public void writeText(WebElement element, String text){
       waitForVisibility(element);
        element.sendKeys(text);
    }

    public String rewadText(WebElement element){
        waitForVisibility(element);
       return element.getText();
    }

    public void isAlertPresent(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.switchTo().alert().accept();

    }

    public void isAlertPresentDismiss(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       return driver.switchTo().alert().getText();
    }
}
