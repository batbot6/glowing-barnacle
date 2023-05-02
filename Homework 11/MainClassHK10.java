package Homework_11;

import Homework_10.AfterLoginPage;
import Homework_10.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainClassHK10 {

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {

                    ChromeOptions options = new ChromeOptions();

                    options.setBinary("C:/Program Files/Google/Chrome/Application/Chrome.exe");
                    System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/Autom1_/src/test/resources/drivers/chromedriver.exe");

                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);

                }
                break;
        }
        return driver;
    }

    @Test

    public void method1() {
        WebDriver driver1 = getBrowser("Chrome");

        driver1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver1.get("https://www.saucedemo.com");
        Homework_10.HomePage home1 = PageFactory.initElements(driver1, HomePage.class);
        driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        home1.loginUser("problem_user", "secret_sauce");

        Homework_10.AfterLoginPage after1 = PageFactory.initElements(driver1, AfterLoginPage.class);

        driver1.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        after1.assertStuffAfterLogin();
        driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        after1.clickOnLight();

        driver1.close();

    }

    @After
    public void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            //drivers.get(key).quit();
        }
    }


    }


