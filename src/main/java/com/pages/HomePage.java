package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement signuplink;

    @FindBy(xpath = "//a[@id='login2']")
    private WebElement loginlink;

    @FindBy(xpath = "//a[@id='logout2']")
    private WebElement logoutlink;

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    private WebElement contactLink;

    public SignupPage clickSignuplink(){

        clickElement(signuplink);

        return new SignupPage(driver);
    }

    public LoginPage loginClick(){
        clickElement(loginlink);
        return new LoginPage(driver);
    }

    public LogoutPage logoutClick(){
        clickElement(logoutlink);
        return new LogoutPage(driver);
    }

    public BannerPage checkBannerPage(){
        return new BannerPage(driver);
    }

    public ContactPage clickContactlink(){
        clickElement(contactLink);
        return new ContactPage(driver);
    }

    public CategarySelectionPage selectCategory(){
        return new CategarySelectionPage(driver);
    }

    public ProductSelectionPage selectProduct(){

        return new ProductSelectionPage(driver);
    }

}
