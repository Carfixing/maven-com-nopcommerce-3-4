package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
   HomePage homePage = new HomePage();
   RegisterPage registerPage = new RegisterPage();

   @Test
   public void userShouldNavigateToRegisterPageSuccessfully() {
       homePage.clickOnRegisterstab();
       String expectedMessage = "Register";
       String actualMessage = registerPage.getVerifyTextVerifyregisterlink();
       Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
   }
   @Test
   public void userSholdRegisterAccountSuccessfully() {
       homePage.clickOnRegisterstab();
       registerPage.clickOnRadioButton();
       registerPage.enterTheFirstName("Mira");
       registerPage.enterTheLastName("Patel");
       registerPage.enterTheDateOfBirth("16");
       registerPage.enterTheMonthOfYear("december");
       registerPage.enterTheYearForBirth("1992");
       registerPage.enterEmailToEmailField("prime887@gmail.com");
       registerPage.enterPasswordToPasswordField("patel1234");
       registerPage.enterConFormPasswordToConfirmPassword("patel1234");
       registerPage.clickOnRegisterButton();
       String expectedMessage = "Your registration completed";
       String actualMessage = registerPage.verifyTextYourRegistrationCompleted();
       Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");

   }
}
