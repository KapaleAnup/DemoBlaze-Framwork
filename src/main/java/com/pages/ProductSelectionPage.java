package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductSelectionPage extends BasePage {

    public ProductSelectionPage(WebDriver driver) {
        super(driver);
    }

    protected String prodctuPrice;
    protected String listOfProducts;

    @FindBy(xpath = "//div[@id='tbodyid']//div//div//a")
    private List<WebElement> productList;

    @FindBy(xpath = "//h2[@class='name']")
    private WebElement productName;
//
//    private String getFinalPrice = "//h5[contains(text(),'%s')]";
//
//
//
//  //  String price = String.format("//h5[contains(text(),'%d')]");
//  //  String finalPrice = price.concat("");
//    By finalPrice = By.xpath(String.format(getFinalPrice," "));
//   // private WebElement productPrice;


    @FindBy(xpath = "//div[@class='card-block']//h5")
    private List<WebElement> price;


    public String getProduct(int index){

        for(int i=0;i<productList.size();i++){
            listOfProducts  = productList.get(index).getText();
            System.out.println("List of product is: "+ listOfProducts);
            productList.get(index).click();
        }
        return listOfProducts;
    }

    public String getProductName(){
       return rewadText(productName);
    }

    public String getPrice(int index){
        for(int i= 0; i<price.size();i++){
            prodctuPrice = price.get(index).getText();
            System.out.println("Product price is : "+ prodctuPrice);
        }
      return prodctuPrice;
    }


}
