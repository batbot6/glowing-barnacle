package Homework_9;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HK9_ {

    private static ChromeDriver driver;
    WebElement element1, element2;

    @BeforeClass

    public static void raiseBrowser() {
        ChromeOptions options = new ChromeOptions();

        options.setBinary("C:/Program Files/Google/Chrome/Application/Chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/Autom1_/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void A_LogInApp()

    {


            driver.get("https://www.saucedemo.com");
            driver.manage().window().maximize();

            driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user");
            driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

            element2 = driver.findElement(By.xpath(".//*[@id='login-button']"));
            Assert.assertNotNull(element2);
            element2.click();

            //driver.switchTo().alert().accept(); - this was needed when entering the site manually, but not automatically

        try {
            element1 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        }  catch (Exception e) {
            Assert.assertNotNull(element1);
            System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());

        }
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
    }


    @AfterClass
    public static void CleanUp() {
        driver.quit();
    }




}
