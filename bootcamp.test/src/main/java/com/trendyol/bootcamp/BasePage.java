package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver webDriver;
    By searchBoxBy =  By.className("search-box");
    By suggestionTitleBy = By.className("suggestion-title");

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    
    public SearchResultPage search(String keyword){
        webDriver.findElement(searchBoxBy).sendKeys(keyword + Keys.ENTER);
        return new SearchResultPage(webDriver);
    }
    public void enterSearchKeyword(String keyword){
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
    }
    public boolean isSuggestionDisplayed(){
        return webDriver.findElement(suggestionTitleBy).isDisplayed();
    }
}
