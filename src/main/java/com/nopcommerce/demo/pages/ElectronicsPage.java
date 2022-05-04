package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By verifyElectronics = By.linkText("Electronics");

    public String getVerifyTextElectronics(){
        return getTextFromElement(verifyElectronics);
    }
}
