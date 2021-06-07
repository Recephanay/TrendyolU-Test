package com.trendyol.bootcamp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {



     @Test
     public void shouldLogin(){
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = homePage.getLoginPage();
        User user = new User("hanayrecep@gmail.com", "15711571203h");

        homePage = loginPage.login(user.getEmail(),user.getPassword());

       String accountButtonText = homePage.getAccountText();
       assertEquals(accountButtonText,"Hesabım");


    }



}
