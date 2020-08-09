package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantSearchResultPage extends ConstantBasePage {
    public static final By FLIGHT_FROM = By.cssSelector(".div-search-list-items > .rt-domestic:nth-child(2) .rt-domestic-item:nth-child(2) input[type=\"button\"]");
    public static final By FLIGHT_TO = By.cssSelector(".div-search-list-items > .rt-domestic:nth-child(3) .rt-domestic-item:nth-child(2) input[type=\"button\"]");
    public static final By SEARCH_BUTTON = By.className("bt-choose");
}
