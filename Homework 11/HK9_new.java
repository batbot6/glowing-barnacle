package Homework_11;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HK9_new extends MainClassHK10 {

    private static ChromeDriver driver;
    WebElement element1, element2;

  //  @BeforeClass

  //  public static void raiseBrowser() {
    //    ChromeOptions options = new ChromeOptions();

    //    options.setBinary("C:/Program Files/Google/Chrome/Application/Chrome.exe");
     //   System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/Autom1_/src/test/resources/drivers/chromedriver.exe");
    //    driver = new ChromeDriver();    }

    @Test
    public void A_LogInApp()

    {

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-name")));
        driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");



        element2 = driver.findElement(By.xpath(".//*[@id='login-button']"));
        Assert.assertNotNull(element2);
        element2.click();

        //driver.switchTo().alert().accept(); - this was needed when entering the site manually, but not automatically

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")));
            element1 = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));

        }  catch (Exception e) {
            Assert.assertNotNull(element1);
            System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());

        }
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
    }


    @After
    public static void CleanUp() {
        driver.quit();
    }




}