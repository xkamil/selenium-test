package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {
    private WebDriver driver;

    public final String URL = "https://www.google.pl/";
    private final By searchBoxLocator = By.cssSelector("input[name=\"q\"]");
    private final By searchButtonLocator = By.cssSelector("input[name=\"btnK\"]");

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleMainPage open() {
        driver.get(URL);
        return this;
    }

    public GoogleMainPage setSearchText(String text) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.clear();
        searchBox.sendKeys(text);
        return this;
    }

    public GoogleMainPage search() {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(Keys.ENTER);
        return this;
    }
}
