package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {



       By accountButtonBy = By.className("account-user");
       By componentListBy = By.className("component-list");

    WebDriver webDriver;
    public HomePage(WebDriver webDriver){
        this.webDriver=webDriver;
    }





    public LoginPage getLoginPage(){
        webDriver.findElement(accountButtonBy).click();
        return new LoginPage(webDriver);
    }
    public void waitForLoad(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(componentListBy));
    }
    public String getAccountText(){

        return webDriver.findElement(accountButtonBy).getText();

    }
}
