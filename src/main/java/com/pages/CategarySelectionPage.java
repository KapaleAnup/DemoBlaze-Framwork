package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CategarySelectionPage extends BasePage {

    public CategarySelectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='list-group']")
    private List<WebElement> categories;

    public String setCategories(int index){

        List<WebElement> category = categories;

        for (int i=0;i<category.size();i++){
          List<String> categoryList = categories.stream().map(element -> element.getText()).collect(Collectors.toList());
           // String categoryList = categories.get(i).getText();
            System.out.println(categoryList);
            category.get(index).click();
        }


        return null;
    }
}
