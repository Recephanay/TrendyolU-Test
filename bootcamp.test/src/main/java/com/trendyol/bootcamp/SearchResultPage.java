package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    WebDriver webDriver;

    By resultTextBy = By.cssSelector(".dscrptn >h1");

    public SearchResultPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public String getResultText() {
        return webDriver.findElement(resultTextBy).getText();

    }
}
