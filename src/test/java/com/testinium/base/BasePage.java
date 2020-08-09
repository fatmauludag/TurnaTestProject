package com.testinium.base;

import com.testinium.page.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement findElement(By by) {
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }


    public HomePage callHomePage() {
        driver.get("https://www.turna.com/");
        return new HomePage(driver);
    }

    public void click(By by) {
        untilElementClickable(by);
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        isElementDisplayed(by);
        WebElement el = findElement(by);

        el.clear();
        el.sendKeys(text);

        // Assert.assertEquals(el.getText(),text);
    }

    public void assertInput(By by, String expectedText) {
        WebElement el = findElement(by);
        Assert.assertEquals(el.getText(),expectedText);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public String getAttribute(By by, String name) {
        return findElement(by).getAttribute(name);
    }

    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }

    public void clickWithAction(By by) {
        Actions actions = new Actions(driver);

        actions
                .moveToElement(findElement(by))
                .click()
                .build()
                .perform();
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public boolean isElementDisplayed(By by) {
        return findElement(by).isDisplayed();
    }

    public void untilElementAppear(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebDriver getDriver() {
        return driver;
    }

}
