package Homework_10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginPage {

    WebDriver driver1;
    public AfterLoginPage(WebDriver driver1) {
        this.driver1 = driver1;
    }



    WebElement element1;
    public void assertStuffAfterLogin() {
     try {
        element1 = driver1.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
    }  catch (Exception e) {
        Assert.assertNotNull(element1);
        System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());




                            }
                               }

 //     public void clickStuffAfterLogin() {
   //       driver1.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement blueBikeLight;

    public void clickOnLight() {
        blueBikeLight.click();
    }


}


