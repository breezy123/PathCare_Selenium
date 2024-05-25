package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class SeleniumDriver {

    public enum BrowserType {
        CHROME, MS_EDGE} //choosing browser type

    private static WebDriver driver;
    private BrowserType currentBrowser;

    public static WebDriver getDriver() {
        return driver;
    }

    public SeleniumDriver(BrowserType browser) {
        this.currentBrowser = browser;
        launchDriver();
    }

    public void launchDriver() {
        try {
            switch (currentBrowser) {
                case CHROME:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    WebDriverManager.chromedriver().setup();
                    chromeOptions.addArguments("--headless=new");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case MS_EDGE:
                    EdgeOptions edgeOptions = new EdgeOptions();
                    WebDriverManager.edgedriver().setup();
                    edgeOptions.addArguments("--guest");
                    edgeOptions.addArguments("--remote-allow-origins=*");
                    edgeOptions.addArguments("-headless");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    System.err.println("Invalid Browser");
                    break;
            }
        } catch (Exception ex) {
            System.err.println("[Error]: Error Launching driver " + ex.getMessage());
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
