package PageObjectClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;
import java.sql.SQLOutput;

public class UserHomePage {
    private WebDriver driver;

    private String pageTitle = "Automation Exercise";

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logout;

    public UserHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogoutlink() {
        logout.click();
    }

    public void getPageTitle() {
        if (driver.getTitle().equalsIgnoreCase(pageTitle)){
            System.out.println("Page title is " + pageTitle);
        Assert.assertTrue(true);}
         else
        { System.out.println("Page title is not " + pageTitle);
        Assert.assertFalse(false);
    }}
}
