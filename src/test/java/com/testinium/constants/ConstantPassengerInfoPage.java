package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantPassengerInfoPage extends ConstantBasePage {
    public static final By FIRST_NAME_INPUT = By.className("firstname");
    public static final By LAST_NAME_INPUT = By.className("lastname");
    public static final By DAY_OF_BIRTH_INPUT = By.className("day-of-birth");
    public static final By MONTH_OF_BIRTH_INPUT = By.className("month-of-birth");
    public static final By YEAR_OF_BIRTH_INPUT = By.className("year-of-birth");
    public static final By NATIONALITY_INPUT = By.id("passenger-nationality");
    public static final By CITIZEN_NO_INPUT = By.className("citizenno");
    public static final By HES_CODE_INPUT = By.className("hesCode");
    public static final By EMAIL_INPUT = By.id("txtEmail");
    public static final By PHONE_INPUT = By.id("txtPhone");
    public static final By BOOKING_BUTTON = By.className("to-booking");
}
