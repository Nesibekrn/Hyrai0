package stepdefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {
    public static WebDriver driver;
    public static Actions actions;
    public static ReusableMethods browserUtilities = new ReusableMethods();

    public static boolean isHeadless = false;
    public static String browserType = "chrome";

    public static boolean isFullScreen = true;
    public static int width;
    public static int height;

    @Before(value = "@headless", order = 0)
    public void setIsHeadless() {
        isHeadless = true;
    }

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }


    @Before(value = "@iPhone12", order = 0)
    public void setiPhone12() {
        isFullScreen = false;
        width = 390;
        height = 844;
    }

    @Before(order = 1, value = "@UI")
    public void setup() {

        driver = Driver.getDriver();

        actions = new Actions(driver);
    }

    @After(value = "@UI")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();

    }


    @Before("@DB")
    public void setupDatabase() {
        //DatabaseUtilities.createConnection();

    }

    @After("@DB")
    public void closeDatabase() {
        // DatabaseUtilities.closeConnection();

    }

    @Before("@company")
    public void companyLogin() {
        System.out.println(
                "email : " + ConfigReader.getProperty("companyUser_email") +
                        " password : " + ConfigReader.getProperty("companyUser_password")
        );
    }


}