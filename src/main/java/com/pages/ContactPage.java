package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class ContactPage extends BasePage {
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "recipient-email")
    private WebElement contactEmail;

    @FindBy(id = "recipient-name")
    private WebElement recipientName;

    @FindBy(xpath = "//textarea[@id='message-text']")
    private WebElement messageText;

    @FindBy(xpath = "//button[contains(text(),'Send message')]")
    private WebElement sendMessageBtn;


    public void setContactEmail(String emailtext){
        writeText(contactEmail, emailtext);
    }

    public void setRecipientName(String name){
        writeText(recipientName, name);
    }

    public void setMessageText(String message){
        writeText(messageText, message);
    }

    public void setSendMessageBtn(){
        clickElement(sendMessageBtn);
    }

}
