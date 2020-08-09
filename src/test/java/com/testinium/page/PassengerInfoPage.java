package com.testinium.page;

import com.testinium.base.BasePage;
import com.testinium.constants.ConstantPassengerInfoPage;
import com.testinium.model.PaymentInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerInfoPage extends BasePage {

    public PassengerInfoPage(WebDriver driver) {
        super(driver);
    }

    public PassengerInfoPage fillPaymentInformations(PaymentInformation payInfo) {

        clickWithAction(By.id("lb-" + payInfo.Gender));

        sendKeys(ConstantPassengerInfoPage.FIRST_NAME_INPUT, payInfo.Name);

        sendKeys(ConstantPassengerInfoPage.LAST_NAME_INPUT, payInfo.Surname);

        selectOptionByValue(ConstantPassengerInfoPage.DAY_OF_BIRTH_INPUT, payInfo.BirthDay);

        selectOptionByValue(ConstantPassengerInfoPage.MONTH_OF_BIRTH_INPUT, payInfo.BirthMonth);

        selectOptionByValue(ConstantPassengerInfoPage.YEAR_OF_BIRTH_INPUT, payInfo.BirthYear);

        selectOptionByValue(ConstantPassengerInfoPage.NATIONALITY_INPUT, payInfo.Nationality);

        sendKeys(ConstantPassengerInfoPage.CITIZEN_NO_INPUT, payInfo.CitizenNo);

        sendKeys(ConstantPassengerInfoPage.HES_CODE_INPUT, payInfo.HesNo);

        sendKeys(ConstantPassengerInfoPage.EMAIL_INPUT, payInfo.Email);

        sendKeys(ConstantPassengerInfoPage.PHONE_INPUT, payInfo.NumberPhone);

        return new PassengerInfoPage(driver);
    }

    public PassengerInfoPage proceedToPayment() {

        click(ConstantPassengerInfoPage.BOOKING_BUTTON);

        return new PassengerInfoPage(driver);
    }

}
