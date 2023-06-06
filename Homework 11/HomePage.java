package Homework_11;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
           // System.out.("Login person as: " + " Username: " + userName + " Password: " + password);


    public void sendStuff(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);

    }

        public void clickButton() {
            this.loginButton.click();
            // login page should open, username and password should be written and login button should be clicked
        }

    }




