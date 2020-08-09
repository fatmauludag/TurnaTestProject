package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.model.Genders;
import com.testinium.model.PaymentInformation;
import com.testinium.page.HomePage;
import org.junit.Test;

public class Main extends BaseTest {

    @Test
    public void scenarioStep1() throws InterruptedException {
        new HomePage(driver)
                .callHomePage()
                .closePopups()
                .chooseDeparture()
                .chooseFlightFrom("IST")
                .chooseFlightTo("ADB")
                .chooseDateRange("22","23")
                .search()
                .chooseAirline("TK")
                .chooseFlightFrom()
                .chooseFlightTo()
                .continuee()
                .fillPaymentInformations(getPaymentInformation())
                .proceedToPayment();

        // Thread.sleep(10000);
    }

    private PaymentInformation getPaymentInformation() {
        PaymentInformation payInfo = new PaymentInformation();
        payInfo.Name = "Fatma";
        payInfo.Surname = "ULUDAĞ";
        payInfo.Gender = Genders.Female;
        payInfo.BirthDay = "20";
        payInfo.BirthMonth = "12";
        payInfo.BirthYear = "1994";
        payInfo.Nationality = "TR";
        payInfo.CitizenNo = "19345664000";
        payInfo.NumberPhone = "5555555555";
        payInfo.HesNo = "2202FM2020";
        payInfo.Email = "taskmailim2020@gmail.com";
        payInfo.ShouldInsurance = false;
        return payInfo;
    }


}
