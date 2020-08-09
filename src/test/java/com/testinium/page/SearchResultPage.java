package com.testinium.page;

import com.testinium.base.BasePage;
import com.testinium.constants.ConstantSearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage chooseAirline(String airlineCode) throws InterruptedException {

        new Actions(driver)
                .moveToElement(findElement(By.id("airline-" + airlineCode)))
                .moveToElement(findElement(By.cssSelector("#airline-" + airlineCode + " a.filter-only")))
                .click()
                .build()
                .perform();

        Thread.sleep(500);

        return new SearchResultPage(driver);
    }

    public SearchResultPage chooseFlightFrom() throws InterruptedException {

        click(ConstantSearchResultPage.FLIGHT_FROM);

        Thread.sleep(500);

        return new SearchResultPage(driver);
    }

    public SearchResultPage chooseFlightTo() throws InterruptedException {

        click(ConstantSearchResultPage.FLIGHT_TO);

        Thread.sleep(500);

        return new SearchResultPage(driver);
    }

    public PassengerInfoPage continuee() {

        click(ConstantSearchResultPage.SEARCH_BUTTON);

        return new PassengerInfoPage(driver);
    }
}
