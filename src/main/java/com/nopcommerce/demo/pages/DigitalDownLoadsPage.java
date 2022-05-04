package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownLoadsPage extends Utility {

    By verifyDigitaldownloadstab = By.linkText("Digital downloads");

    public String getVerifyTextDigitaldownloads(){
        return getTextFromElement(verifyDigitaldownloadstab);
    }
}
