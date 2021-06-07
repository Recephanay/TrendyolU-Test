package com.trendyol.bootcamp;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest {
    @Test
    public void shouldSearch(){
        String keyword = "Telefon";
        HomePage homePage = new HomePage(webDriver);
        SearchResultPage searchResultPage = homePage.search(keyword);

        String resultText = searchResultPage.getResultText();


        assertEquals(resultText,keyword);

    }
    @Test
    public void shouldSearchBox2(){
        String keyword ="Telefon";
        HomePage homePage = new HomePage(webDriver);
        homePage.enterSearchKeyword(keyword);

        boolean searchRecommendations = homePage.isSuggestionDisplayed();
        assertEquals(searchRecommendations,true);

    }

}
