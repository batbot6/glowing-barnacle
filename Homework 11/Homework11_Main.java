package Homework_11;


import Homework_10.AfterLoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework11_Main extends BrowserFactorylol {

    static WebDriver driver = BrowserFactorylol.getBrowser("Chrome");
    @BeforeClass
            public static void before() {
        driver.get("https://saucedemo.com/");
        driver.manage().window().maximize();
    }
    WebElement element1, element2;



    @Test
    public void A_LogInApp()

    {

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.sendStuff("problem_user","secret_sauce");
        WebDriverWait wait = new WebDriverWait(driver,10);

        element2 = driver.findElement(By.xpath(".//*[@id='login-button']"));
        Assert.assertNotNull(element2);
        element2.click();

        //driver.switchTo().alert().accept(); - this was needed when entering the site manually, but not automatically

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")));

        element1 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        AfterLoginPage after1 = PageFactory.initElements(driver, AfterLoginPage.class);

        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

        after1.assertStuffAfterLogin();


        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        after1.clickOnLight();
            Assert.assertNotNull(element1);

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();

    }

    @After
    public void CleanUp() {
        driver.quit();
    }




}