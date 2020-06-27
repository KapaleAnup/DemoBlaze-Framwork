package com.testcases;

import com.basetest.TestBase;
import com.pages.CategarySelectionPage;
import com.pages.HomePage;
import org.testng.annotations.Test;

public class CategarySelectionPageTests extends TestBase {
    HomePage homePage;
    @Test
    public void testselectCategory(){
       homePage = new HomePage(driver);

       CategarySelectionPage selectionPage = homePage.selectCategory();
       String value = selectionPage.setCategories(0);
        System.out.println("Selected Category is : " +value);
    }

}
