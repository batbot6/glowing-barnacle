package Homework_11;

import Homework_10.AfterLoginPage;
import Homework_10.BrowserFactory;
import Homework_10.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClassHK10 extends BrowserFactory {

    public static void main(String[] args)  {
        WebDriver driver1 = getBrowser("Chrome");

        driver1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver1.get("https://www.saucedemo.com");
      Homework_10.HomePage home1 = PageFactory.initElements(driver1, HomePage.class);
        driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      home1.loginUser("problem_user","secret_sauce");

      Homework_10.AfterLoginPage after1 = PageFactory.initElements(driver1, AfterLoginPage.class);

        driver1.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
      after1.assertStuffAfterLogin();
        driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      after1.clickOnLight();


        closeBrowser();

        }
    }

