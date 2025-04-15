package stepDefination;

import PageObjectClasses.HomePage;
import PageObjectClasses.SignupLogin;
import PageObjectClasses.UserHomePage;
import automationUtilities.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.reactivex.rxjava3.core.Single;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class OpenLoginPageStepDef extends BaseClass
{
    // static WebDriver driver;
    private HomePage homePage;
    private BaseClass baseClass;
    private SignupLogin signupLogin;
    private UserHomePage userHomePage;
    private Logger log;


    @Given("user navigates to the application")
    public void user_navigates_to_the_application() {
        log=LogManager.getLogger(this.getClass().getName());
        baseClass=new BaseClass();
        baseClass.openBrowser();
        log.info("Navigate to the browser");
        homePage = new HomePage(driver);
        userHomePage = new UserHomePage(driver);
        signupLogin = new SignupLogin(driver);
        log.info("Navigate to the URL");

    }
    @When("use clicks in  signup or login  link")
    public void use_clicks_in_signup_or_login_link() {
        homePage.clicksignupOrLogin();



    }
    @Then("Signup or login page should display")
    public void signup_or_login_page_should_display() {

        signupLogin.SignupOrLoginPageTitle();
    }
    @And("user close the browser")
    public void userCloseTheBrowser() {
        baseClass.closeBrowser();
        log.info("Browser closed");
    }

    @And("user enter username as {string} and password as {string}")
    public void userEnterUsernameAsAndPasswordAs(String username, String password) {
        signupLogin.setUserNameField(username);
        signupLogin.setPasswordField(password);

    }

    @And("user click on the login button")
    public void userClickOnTheLoginButton() {
        signupLogin.clickLoginButton();
    }

    @Then("application should navigate to the user Home Page")
    public void applicationShouldNavigateToTheUserHomePage() {

        userHomePage.getPageTitle();
        userHomePage.clickLogoutlink();
    }

    @And("user enter username  and password")
    public void userEnterUsernameAndPassword(DataTable userCredential) {

        List<List<String>>credentialList = userCredential.asLists(String.class);
        for (List<String> value : credentialList) {
            System.out.println(value.get(0)+"======= "+value.get(1));
        }
        signupLogin.setUserNameField(credentialList.get(0).get(0));
        signupLogin.setPasswordField(credentialList.get(0).get(1));




    }

    @And("user enter username  and password with map")
    public void userEnterUsernameAndPasswordWithMap(DataTable userCredential) {

        List<Map<String, String>> credentialMap = userCredential.asMaps(String.class, String.class);
        for (Map<String, String> map : credentialMap) {
            System.out.println(map.get("username")+"====="+map.get("password"));
        }
        signupLogin.setUserNameField(credentialMap.get(0).get("username"));
        signupLogin.setPasswordField(credentialMap.get(0).get("password"));
    }

    @And("user enter username  and password with list")
    public void userEnterUsernameAndPasswordWithList(DataTable userCredential) {
        List<List<String>>credentialList = userCredential.asLists(String.class);
        for (List<String> value : credentialList) {
            System.out.println(value.get(0)+"======= "+value.get(1));
        }
        signupLogin.setUserNameField(credentialList.get(0).get(0));
        signupLogin.setPasswordField(credentialList.get(0).get(1));
    }
}
