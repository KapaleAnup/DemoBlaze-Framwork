package com.testcases;

import com.basetest.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {
    HomePage homePage;
    @Test
    public void testLoginPage(){
        homePage  = new HomePage(driver);

        LoginPage loginPage = homePage.loginClick();
        loginPage.setLoginusernam("anupa");
        loginPage.setLoginpassword("anup");
        loginPage.setLoginbtn();
        System.out.println("Login successfull");

        String profileName = loginPage.profileName();
        System.out.println("Profile name is :" + profileName);
    }
}
