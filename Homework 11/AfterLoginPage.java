package Homework_11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AfterLoginPage {

    WebDriver driver1;
    public AfterLoginPage(WebDriver driver1) {
        this.driver1 = driver1;
    }



    WebElement element1;
    public void assertStuffAfterLogin() {
     try {
        element1 = driver1.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        System.out.println("success finding jacket");
    }  catch (Exception e) {

         driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

         Assert.assertNotNull(element1);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());




                            }
                               }



    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement blueBikeLight;

    public void clickOnLight() {

        WebDriverWait wait = new WebDriverWait(driver1,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#add-to-cart-sauce-labs-bike-light")));

        blueBikeLight.click();
    }


}


