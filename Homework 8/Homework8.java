package Homework_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Homework8 {

    public static WebDriver driver;

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Program Files/Google/Chrome/Application/Chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/Autom1_/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.segabg.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[.='СЪГЛАСЕН СЪМ']")).click();

        driver.findElement(By.linkText("РЕЗУЛТАТИ")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("трънки");
        WebElement elem1 = driver.findElement(By.linkText("България"));
        elem1.click();



    }
}
