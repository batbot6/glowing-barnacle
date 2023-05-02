/*

package Homework_11;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName){
        WebDriver driver = null;

        switch (browserName){
            case "Firefox":
                driver = drivers.get("Firefox");
                if(driver == null){
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if(driver == null){

                    ChromeOptions options = new ChromeOptions();

                    options.setBinary("C:/Program Files/Google/Chrome/Application/Chrome.exe");
                    System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/Autom1_/src/test/resources/drivers/chromedriver.exe");

                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);


                }
                break;
        }
        return driver;
    }

    @After

       public void closeBrowser(){
        for(String key : drivers.keySet() ){
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
} */