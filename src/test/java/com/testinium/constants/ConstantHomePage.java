package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantHomePage extends ConstantBasePage {
    public static final By DEPARTURE_WAY = By.id("lb-way");
    public static final By FLIGHT_FROM = By.id("flight-from");
    public static final By FLIGHT_FROM_CLICK = By.cssSelector("#ui-id-1 > li:nth-child(1)");
    public static final By FLIGHT_TO = By.id("flight-to");
    public static final By FLIGHT_TO_CLICK = By.cssSelector("#ui-id-2 > li:nth-child(1)");
    public static final By DATE_RANGE = By.name("fromdate");
    public static final By DATE_RANGE_FROM = By.cssSelector(".ui-datepicker-group-first td[data-event] > a");
    public static final By DATE_RANGE_TO = By.cssSelector(".ui-datepicker-group-last td[data-event] > a");
    public static final By SEARCH_BTN = By.id("btnSearch");
    public static final By POPUP1 = By.className("popup-close");
    public static final By POPUP2 = By.className("snackbar-btn-close");
}