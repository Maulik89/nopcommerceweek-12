package testsuite;

import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expedctedMessage = "Welcome, Please Sign In!";
        org.testng.Assert.assertEquals(actualMessage, expedctedMessage, "Login page verified");


    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("p@gmail.comd");
        loginPage.enterPassword("abc123123");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual, expected, "error message with inavalid credentials");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("p@gmail.com");
        loginPage.enterPassword("123qwe");
        loginPage.clickOnLoginButton();
        String expected = "Log out";
        Assert.assertEquals(expected, loginPage.verifylogoutlink());


    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("p@gmail.com");
        loginPage.enterPassword("123qwe");
        loginPage.clickOnLoginButton();
        loginPage.clickOnlogoutLink();
        String expected = "Log in";
        Assert.assertEquals(expected, loginPage.verifyloginLink());
    }
}







