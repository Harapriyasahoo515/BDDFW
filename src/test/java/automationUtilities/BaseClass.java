package automationUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    private Properties prop;
    private String AppUrl;
    private String browsername;
    private Logger log;

    public void openBrowser() {

     log=LogManager.getLogger(this.getClass().getName());
        prop = new Properties();
        try {
            prop.load(BaseClass.class.getClassLoader().getResourceAsStream("configurationfile.properties"));

            AppUrl = prop.getProperty("appUrl");
            browsername = prop.getProperty("browser");
            if (browsername.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            }else if (browsername.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            }else if (browsername.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }else
                System.out.println("Invalid browser");


            driver.get(AppUrl);
            driver.manage().window().maximize();
            log.info("User in the application");

        }
        catch (Exception e) {

        }
    }

    public void closeBrowser() {
        driver.quit();
    }
}
