package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage  extends Utility {
    By verifyregisterlink = By.xpath("//h1[contains(text(),'Register')]");
    By radioButton = By.cssSelector("input#gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirth = By.name("DateOfBirthDay");
    By monthOfYear =By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By emailfield = By.id("Email");
    By passwordfield = By.name("Password");
    By confirmPassword = By.name("ConfirmPassword");
    By registerButton = By.name("register-button");
    By verifyRegistercomlete = By.xpath("//div[@class='result']");

    public String getVerifyTextVerifyregisterlink(){
        return getTextFromElement(verifyregisterlink);
    }
    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }
    public void enterTheFirstName(String firstName1){
        sendTextToElement(firstName,firstName1);
    }
    public void enterTheLastName(String lastName1){
        sendTextToElement(lastName,lastName1);
    }
    public void enterTheDateOfBirth(String date){
        sendTextToElement(dateOfBirth,date);
    }
    public void enterTheMonthOfYear(String month){
        sendTextToElement(monthOfYear,month);
    }
    public void enterTheYearForBirth(String year){
        sendTextToElement(yearOfBirth,year);
    }
    public void enterEmailToEmailField(String email){
        sendTextToElement(emailfield,email);
    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordfield,password);
    }
    public void enterConFormPasswordToConfirmPassword(String confirmpassword1){
        sendTextToElement(confirmPassword,confirmpassword1);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyTextYourRegistrationCompleted(){
        return getTextFromElement(verifyRegistercomlete);
    }
}
