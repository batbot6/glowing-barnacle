package Homework_11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    @FindBy(css = "#user-name")
    WebElement userName;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(xpath =".//*[@id='login-button']")
    WebElement loginButton;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void loginUser(String userName, String password){
        System.out.println("Login person as: " + " Username: " + userName + " Password: " + password);

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='login-button']")));


        this.userName.sendKeys(userName);
        this.password.sendKeys(password);

        this.loginButton.click();


        // login page should open, username and password should be written and login button should be clicked
    }
}
