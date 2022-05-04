package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By verifyBooks = By.linkText("Books");

    public String getVerifyTextBooksPage(){
        return getTextFromElement(verifyBooks);
    }
}
