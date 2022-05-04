package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLogInLinkInHomePage();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");

    }
    @Test
    public void  userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLogInLinkInHomePage();
        loginPage.enterEmailId("prime777@gmail.com");
        loginPage.enterPassword("patel1234");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Log out";
        String actualMessage = loginPage.getVerifyLogOutText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }

    @Test
    public void  verifyTheErrorMessage() {

        homePage.clickOnLogInLinkInHomePage();
        loginPage.enterEmailId("prime555@gmail.com");
        loginPage.enterPassword("patel1234");
        loginPage.clickOnLoginButton();
        String expectedMessage ="Login was unsuccessful. Please correct the errors and try again.\n"
                +"No customer account found";
        String actualMessage = loginPage.geterrorMessageInvalidData();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }


}
