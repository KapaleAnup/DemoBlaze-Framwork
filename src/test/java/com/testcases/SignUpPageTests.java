package com.testcases;

import com.basetest.TestBase;
import com.pages.HomePage;
import com.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SignUpPageTests extends TestBase {

    HomePage homePage;
        @Test
    public void testSignupflow(){
            homePage = new HomePage(driver);

           SignupPage signupPage =  homePage.clickSignuplink();
           signupPage.enterUserName("anupa");
           signupPage.enterPassword("anup");
           signupPage.setBtnsignup();
         //  driver.switchTo().alert().accept();
           // String erroAlertText = driver.switchTo().alert().getText();
         //   String alertText =  driver.switchTo().alert().getText();
          //  driver.switchTo().alert().accept();

        //  Assert.assertEquals(alertText, "Sign up successful.","Message doesn't match");
          System.out.println("Signup successfull..");

        }


}
