package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

        By welcomeMessage = By.xpath("//div[@class='page-title']");
        By emailField = By.id("Email");
        By passwordField = By.name("Password");
        By loginButton = By.xpath("//button[@class='button-1 login-button']");
        By verifyLogOut = By.className("ico-logout");
        By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");


        public String getWelcomeMessage(){
            return getTextFromElement(welcomeMessage);
        }
        public void enterEmailId(String email){
            sendTextToElement(emailField, email);
        }
        public void enterPassword(String password){
            sendTextToElement(passwordField, password);
        }
        public void clickOnLoginButton () {
            clickOnElement(loginButton);
        }
        public String getVerifyLogOutText(){
            return getTextFromElement(verifyLogOut);
        }
        public String geterrorMessageInvalidData(){
            return getTextFromElement(errorMessage);
        }
    }

