package com.basetest;

import com.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;
    Properties properties;

    HomePage homePage;

    public TestBase()  {

        properties = new Properties();

        try {
            FileInputStream inputStream = new FileInputStream("src/main/java/com/config/config.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Parameters({"browser"})
    @BeforeClass
    public void initializeBrowsers(String browser){

     if(browser.equals("chrome") || browser.equals("Chrome")){
          WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
     }else if(browser.equals("firefox") || browser.equals("Firefox")){
          WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
   }
        driver.get(properties.getProperty("baseUrl"));
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
















    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initChromeDriver(String baseurl){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        return driver;

    }

    public WebDriver initFrifoxDriver(String baseurl){
        WebDriverManager.firefoxdriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        return driver;

    }

    private void setUpDriver(String browserType, String baseUrl){

        if ("chrome".equals(browserType)) {
            driver = initChromeDriver(baseUrl);
            ;
        } else if ("firefox".equals(browserType)) {
            driver = initFrifoxDriver(baseUrl);

        } else {
            System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
            driver = initChromeDriver(baseUrl);
        }


    }




}
