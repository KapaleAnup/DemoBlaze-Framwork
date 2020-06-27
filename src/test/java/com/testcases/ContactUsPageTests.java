package com.testcases;

import com.basetest.TestBase;
import com.pages.ContactPage;
import com.pages.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactUsPageTests extends TestBase {

    HomePage homePage ;
    @Test
    public void testContactaUspage(){
        homePage = new HomePage(driver);
        ContactPage contactPage = homePage.clickContactlink();
        contactPage.setContactEmail("test@test.com");
        contactPage.setRecipientName("test");
        contactPage.setMessageText("This is a test message, you can ignore..");
        contactPage.setSendMessageBtn();
        String alertText = contactPage.getAlertText();
        System.out.println("Alert Text is : " + alertText);
        contactPage.isAlertPresent();
    }
}
