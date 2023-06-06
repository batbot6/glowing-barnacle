package Homework_11;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterLoginPage {

    WebDriver driver;

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement element1;

    public AfterLoginPage(WebDriver driver) {
       // this.driver = this.driver;
        PageFactory.initElements(this.driver,this);
    }


    public void assertStuffAfterLogin() {

        String ActualTitle2 = element1.getText();
        String ExpectedTitle2 = "Java SDET Bootcamp";
        Assert.assertEquals(ActualTitle2, ExpectedTitle2);

        System.out.println("success finding jacket");





    }




}


