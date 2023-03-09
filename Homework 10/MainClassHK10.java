package Homework_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainClassHK10 extends BrowserFactory {

    public static void main(String[] args) {
        WebDriver driver1 = getBrowser("Chrome");
        driver1.get("https://www.saucedemo.com");
      HomePage home1 = PageFactory.initElements(driver1, HomePage.class);
      home1.loginUser("problem_user","secret_sauce");

      AfterLoginPage after1 = PageFactory.initElements(driver1, AfterLoginPage.class);
      after1.assertStuffAfterLogin();
      after1.clickOnLight();


        closeBrowser();

        }
    }

