package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement loginusername;

    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement loginpassword;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement loginbtn;

    @FindBy(xpath = "//a[@id='nameofuser']")
    private WebElement profilename;


    public void setLoginusernam(String username){

        writeText(loginusername,username);
    }

    public void setLoginpassword(String password){
        writeText(loginpassword,password);
    }

    public void setLoginbtn(){
        try
        {
            if(loginbtn.isDisplayed() || loginbtn.isEnabled()){
                clickElement(loginbtn);
            }else {
                System.out.println("button is not clickable");
            }
        }catch (Exception e){
            System.out.println("Error is : " +e.getStackTrace());
        }


    }

    public String profileName(){

       return rewadText(profilename);
    }
}
