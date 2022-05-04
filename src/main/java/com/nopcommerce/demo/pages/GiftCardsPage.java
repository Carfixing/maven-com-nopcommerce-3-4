package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage  extends Utility {
    By verifyGiftCards = By.linkText("Gift Cards");

    public String getVerifyTextGiftCards(){
        return getTextFromElement(verifyGiftCards);
    }
}
