package DriverWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    private static WebDriver driver;

    public void openWebpage(){
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }
    public WebDriver getDriver(){
        return driver;
    }

    public void quitWebpage(){
        driver.quit();
    }
}
