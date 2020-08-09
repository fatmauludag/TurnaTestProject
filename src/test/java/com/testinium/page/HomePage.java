package com.testinium.page;

import com.testinium.base.BasePage;
import com.testinium.constants.ConstantHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage chooseDeparture() {
        click(ConstantHomePage.DEPARTURE_WAY);
        return new HomePage(driver);
    }

    public HomePage chooseFlightFrom(String str) throws InterruptedException {
        sendKeys(ConstantHomePage.FLIGHT_FROM, str);

        Thread.sleep(1500);

        click(ConstantHomePage.FLIGHT_FROM_CLICK);
        return new HomePage(driver);
    }

    public HomePage chooseFlightTo(String str) throws InterruptedException {
        sendKeys(ConstantHomePage.FLIGHT_TO, str);

        Thread.sleep(1500);

        click(ConstantHomePage.FLIGHT_TO_CLICK);
        return new HomePage(driver);
    }

    public HomePage chooseDateRange(String dayFrom, String dayTo) throws InterruptedException {
        clickWithAction(ConstantHomePage.DATE_RANGE);

        Thread.sleep(250);

        List<WebElement> fromDays = findElements(ConstantHomePage.DATE_RANGE_FROM);

        for (WebElement dayEl : fromDays) {
            if (dayEl.getText().equals(dayFrom)) {
                dayEl.click();
                break;
            }
        }

        Thread.sleep(500);

        List<WebElement> toDays = findElements(ConstantHomePage.DATE_RANGE_TO);

        for (WebElement dayEl : toDays) {
            if (dayEl.getText().equals(dayTo)) {
                dayEl.click();
                break;
            }
        }

        Thread.sleep(250);

        return new HomePage(driver);
    }

    public SearchResultPage search() {
        closePopups();
        click(ConstantHomePage.SEARCH_BTN);
        return new SearchResultPage(driver);
    }

    public HomePage closePopups() {
        try {
            click(ConstantHomePage.POPUP1);
            Thread.sleep(250);
        } catch (Exception ignored) {

        }
        try {
            click(ConstantHomePage.POPUP2);
            Thread.sleep(250);
        } catch (Exception ignored) {

        }
        return new HomePage(driver);

    }


}
