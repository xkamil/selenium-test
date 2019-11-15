package com.canx;

import com.GoogleMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ApplicationTest {

    private WebDriver driver;
    private GoogleMainPage googleMainPage;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        googleMainPage = new GoogleMainPage(driver);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void test() {
        // given - user is on google man page
        googleMainPage.open();

        // when - user enters seraching text and press enter
        googleMainPage.setSearchText("dupa");
        googleMainPage.search();
    }

}
