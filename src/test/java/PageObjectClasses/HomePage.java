package PageObjectClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

public class HomePage {

    public WebDriver driver;

    @FindBy (xpath = "//a[@href='/login']")
    private WebElement SignupOrLoginLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clicksignupOrLogin() {
        SignupOrLoginLink.click();
        System.out.println("User in the signup link");
    }

//




}
