package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.OpenQASM.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;
    static JavascriptExecutor js;

    public static WebDriver initialize_Driver(String browser) {

        properties = ConfigReader.getProperties();
        js = (JavascriptExecutor) driver;

        if (browser.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();


        } else if (browser.equals("Firefox")) {

            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageloadTimeout"));

        int ImpWait = Integer.parseInt(properties.getProperty("implicityWait"));


        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(ImpWait, TimeUnit.SECONDS);


        return getDriver();
    }
    public static WebDriver getDriver(){

        return driver;
    }

}
