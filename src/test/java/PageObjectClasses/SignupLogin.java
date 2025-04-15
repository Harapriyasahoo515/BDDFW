package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

public class SignupLogin {

    public WebDriver driver;
    private String ExpectedString=" Automation Exercise - Signup / Login";

    @FindBy (xpath = "//input[@data-qa='login-email']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    public SignupLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserNameField(String userName) {
        userNameField.sendKeys(userName);

    }
    public void setPasswordField(String password) {
        passwordField.sendKeys(password);

    }
    public void clickLoginButton() {
        loginButton.click();
    }

    public void SignupOrLoginPageTitle(){
        if (driver.getTitle().equalsIgnoreCase(ExpectedString)) {
            System.out.println("SignuporLogin Page Title displayed");
        }else
            System.out.println("SignuporLogin Page Title  not displayed");
    }



}
