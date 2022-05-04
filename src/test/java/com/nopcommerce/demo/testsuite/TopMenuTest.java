package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownLoadsPage digitalDownLoadsPage = new DigitalDownLoadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        String expectedMessage = "Computers";
        String actualMessage = computerPage.getVerifyTextComputer();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void  userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickOnElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicsPage.getVerifyTextElectronics();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void  userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickOnApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = apparelPage.getVerifyTextApparelPage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void   userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        homePage.clickOnDigitaldownloadstab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownLoadsPage.getVerifyTextDigitaldownloads();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void  userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBookstab();
        String expectedMessage = "Books";
        String actualMessage = booksPage.getVerifyTextBooksPage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void  userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelrytab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getVerifyTextJewelry();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        homePage.clickOnGiftCardstab();
        String expectedMessage = "Gift Cards";
        String actualMessage = giftCardsPage.getVerifyTextGiftCards();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
}
