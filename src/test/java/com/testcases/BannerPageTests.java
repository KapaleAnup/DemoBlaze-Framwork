package com.testcases;

import com.basetest.TestBase;
import com.pages.BannerPage;
import com.pages.HomePage;
import org.testng.annotations.Test;

public class BannerPageTests extends TestBase {

    HomePage homePage;
    @Test
    public void testCrousalBanner(){

        homePage = new HomePage(driver);

       BannerPage bannerPage = homePage.checkBannerPage();
       bannerPage.clickOnCrousalIcon();
        System.out.println("banner page getting displayed");

    }
}
