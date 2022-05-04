package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By verifyComputer = By.linkText("Computers");

    public String getVerifyTextComputer(){
        return getTextFromElement(verifyComputer);
    }
}
