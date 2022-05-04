package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By clickOnLoginLink = By.linkText("Log in");
    By computertab = By.linkText("Computers");
    By electronicstab =By.linkText("Electronics");
    By appareltab = By.linkText("Apparel");
    By digitaldownloadstab = By.linkText("Digital downloads");
    By bookstabs = By.linkText("Books");
    By jewelrytabs = By.linkText("Jewelry");
    By giftCardstabs = By.linkText("Gift Cards");
    By registertabs = By.linkText("Register");

    public void clickOnLogInLinkInHomePage(){
        clickOnElement(clickOnLoginLink);
    }
    public void clickOnComputerTab(){
        clickOnElement(computertab);
    }
    public void clickOnElectronicsTab(){
        clickOnElement(electronicstab);
    }
    public void clickOnApparelTab(){
        clickOnElement(appareltab);
    }
    public void clickOnDigitaldownloadstab (){
        clickOnElement(digitaldownloadstab);
    }
    public void clickOnBookstab (){
        clickOnElement(bookstabs);
    }
    public void clickOnJewelrytab (){
        clickOnElement(jewelrytabs);
    }
    public void clickOnGiftCardstab (){
        clickOnElement(giftCardstabs);
    }
    public void clickOnRegisterstab (){
        clickOnElement(registertabs);
    }

}
