package com.testcases;

import com.basetest.TestBase;
import com.pages.HomePage;
import com.pages.ProductSelectionPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProductSelectionTests extends TestBase {

    HomePage homePage;
    protected String productName;

    @Test
    public void testListedProduct(){
       homePage = new HomePage(driver);

       ProductSelectionPage selectionPage = homePage.selectProduct();

//        String productname = selectionPage.getProductName();
//        System.out.println("Product Name is : " + productname);

//        String price = selectionPage.getPrice(1);
//        System.out.println("Product price is :"+ price);
        System.out.println("product is getting selected");
        productName = selectionPage.getProduct(1);
        System.out.println("product is selected :" + productName);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
    }
}
