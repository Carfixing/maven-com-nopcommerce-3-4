package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By verifyApparel = By.linkText("Apparel");

    public String getVerifyTextApparelPage(){
        return getTextFromElement(verifyApparel);
    }
}
