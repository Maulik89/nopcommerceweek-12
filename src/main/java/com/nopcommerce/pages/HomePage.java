package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By loginLink = By.xpath("//a[@class='ico-login']");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By nopcommerceLogo = By.xpath("//img[@alt='nopCommerce demo store']");
    By myAccountLink = By.xpath("//a[@class='ico-account']");
    By logoutLink = By.xpath("//a[@class='ico-logout']");
    By ComputersMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By ElectronicsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]");
    By ApparelMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel ')]");
    By DigitaldownloadsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads ')]");
    By BooksMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books ')]");
    By JewelryMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]");
    By GiftCardsMenu = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]");

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnlogoLink() {
        Reporter.log("clicking on logolink " + nopcommerceLogo.toString());
        clickOnElement(loginLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("clicking on myaccountLink" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOutLink() {
        Reporter.log("clicking on LogOutLink" + logoutLink.toString());
        clickOnElement(logoutLink);
    }

    public void clickOnComputers() {
        Reporter.log("clicking on Computers" + ComputersMenu.toString());
        clickOnElement(ComputersMenu);
    }

    public void clickOnElectronics() {
        Reporter.log("clicking on Electronics" + ElectronicsMenu.toString());
        clickOnElement(ElectronicsMenu);
    }

    public void Apparel() {
        Reporter.log("clicking on Apparel" + ApparelMenu.toString());
        clickOnElement(ApparelMenu);
    }

    public void clickOnDigitaldownloads() {
        Reporter.log("clicking on Digitaldownloads" + DigitaldownloadsMenu.toString());
        clickOnElement(DigitaldownloadsMenu);
    }

    public void clickOnBooks() {
        Reporter.log("clicking on Books" + BooksMenu.toString());
        clickOnElement(BooksMenu);
    }

    public void clickOnJewelery() {
        Reporter.log("clicling on Jewelery" + JewelryMenu.toString());
        clickOnElement(JewelryMenu);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on GiftCards" + GiftCardsMenu.toString());
        clickOnElement(GiftCardsMenu);
    }

    public String VerifyRegisterLink() {
        return getTextFromElement(registerLink);
    }

    public String VerifyComputersText() {
        return getTextFromElement(this.ComputersMenu);
    }

    public void enterEmailId(String s) {
    }
}

