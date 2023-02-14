package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    By BuildYourOwnComputerLink = By.linkText("Build your own computer");
    By ProcessorDropDown = By.id("product_attribute_1");
    By RamDropDown = By.id("product_attribute_2");
    By HddRadio = By.id("product_attribute_3_6");
    By OsRadio = By.id("product_attribute_4_9");
    By SoftwareCheckbox = By.id("product_attribute_5_11");
    By AddtoCartButton = By.id("add-to-cart-button-1");
    By Theproduchasbeenaddedtoyourshoppingcart = By.xpath("//div[@class='bar-notification success']");
    By Product = By.xpath("//a[text()='Build your own computer']");


    public void BuildYourOwnComputerLink() {
        Reporter.log("click on Build your own computer" + BuildYourOwnComputerLink.toString());
        clickOnElement(BuildYourOwnComputerLink);
    }

    public void SelectProcessorDropDown(String DropDown) {
        selectByVisibleTextFromDropDown(ProcessorDropDown, DropDown);

    }

    public void RamDropDown(String down) {
        selectByVisibleTextFromDropDown(RamDropDown, down);
    }

    public void HddRadio() {
        this.clickOnElement(this.HddRadio);
    }

    public void OsRadio() {
        this.clickOnElement(this.OsRadio);
    }

    public void SoftwareCheckbox() {
        this.clickOnElement(this.SoftwareCheckbox);
    }

    public void ClickonADdToCart() {
        this.clickOnElement(this.AddtoCartButton);
    }

    public String Theproduchasbeenaddedtoyourshoppingcart() {
        return getTextFromElement(Theproduchasbeenaddedtoyourshoppingcart);
    }

    public void ClickonProduct() {
        this.clickOnElement(this.Product);
    }
}






