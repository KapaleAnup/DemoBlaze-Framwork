package com.testcases;

import com.basetest.TestBase;
import com.pages.HomePage;
import com.pages.LogoutPage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LogoutPageTests extends TestBase {
    HomePage homePage;
   // @Test
    public void testLogout(){

        homePage = new HomePage(driver);
        LogoutPage logoutPage = homePage.logoutClick();
    }
}
