package testsuite;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expected = "Register";
        Assert.assertEquals(expected, homePage.VerifyRegisterLink());
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink();
        registerPage.ClickonRegisterButton();
        String expectedFirstname = "First name is required.";
        Assert.assertEquals(expectedFirstname, registerPage.VerifyFirstnameError());

        String expectedLastname = "Last name is required.";
        Assert.assertEquals(expectedLastname, registerPage.VerifyLastnameError());

        String expectedEmail = "Email is required.";
        Assert.assertEquals(expectedEmail, registerPage.VerifyEmailError());

        String expectedPassword = "Password is required.";
        Assert.assertEquals(expectedPassword, registerPage.VerifyPasswordError());

        String expectedConfirmPass = "Password is required.";
        Assert.assertEquals(expectedConfirmPass, registerPage.VerifyConfirmPasswordError());
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.Clickonmale();
        registerPage.EnterFirstname("mp");
        registerPage.EnterLastname("hp");
        registerPage.SelectDay("1");
        registerPage.SelectMonth("2");
        registerPage.SelectYear("2001");
        registerPage.EnterEmail("p@gmail.com");
        registerPage.EnterPassword("123qwe");
        registerPage.EnterConfirmPassword("123qwe");
        registerPage.ClickonRegisterButton();
        String expected = "Your registration completed";
        Assert.assertEquals(expected, registerPage.VerifyRegisterSuccessfullMsg());
    }
}

