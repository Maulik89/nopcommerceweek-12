package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputerPage extends Utility {


    By Computers = By.linkText("Computers");
    By Desktops = By.linkText("Desktops");
    By Notebooks = By.linkText("Notebooks");
    By Software = By.linkText("Software");


    public void Computers() {
        Reporter.log("Clicking on Computers " + Computers.toString());
        clickOnElement(Computers);
    }

    public void Desktops() {
        Reporter.log("clicking on Desktops" + Desktops.toString());
        clickOnElement(Desktops);
    }

    public void Notebooks() {
        Reporter.log("clicking on Notebooks" + Notebooks.toString());
        clickOnElement(Notebooks);
    }

    public void Software() {
        Reporter.log("clicking on Software" + Software.toString());
        clickOnElement(Software);
    }

    public String VerifyDesktoplink() {
        return getTextFromElement(Desktops);
    }

}