package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import sun.security.util.Password;

public class LoginPage extends Utility {

    By loginLink = By.className("ico-login");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailfield = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");

    By logoutLink = By.xpath("//a[@class='ico-logout']");

    public void clickOnloginLink() {
        clickOnElement(loginLink);
    }

    public String verifyloginLink() {
        return getTextFromElement(loginLink);
    }

    public String getWelcomeText() {
        return this.getTextFromElement(this.welcomeText);
    }

    public void enterEmailId(String email) {
        this.sendTextToElement(this.emailfield, email);
    }

    public void enterPassword(String Password) {
        this.sendTextToElement(this.passwordField, Password);
    }

    public void clickOnLoginButton() {
        this.clickOnElement(this.loginButton);
    }

    public String getErrorMessage() {
        return this.getTextFromElement(this.errorMag);
    }

    public String verifylogoutlink() {
        return getTextFromElement(logoutLink);
    }

    public void clickOnlogoutLink() {
        this.clickOnElement(this.logoutLink);
    }

}
