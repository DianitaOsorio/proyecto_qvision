package demo.realworld.io.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverRemoteBrowser {
    public static WebDriver driver;
    public static DriverRemoteBrowser iniciaConEstasOpciones() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--allow-running-insecure-content --disable-popup-blocking ");
        options.addArguments("--disable-infobars --test-type --disable-extensions --disable-translate");
        options.addArguments("--ignore-certificate-errors --incognito --disable-gpu --no-sandbox --disable-download-notification");

        driver = new ChromeDriver(options);
        return new DriverRemoteBrowser();
    }


    public static DriverRemoteBrowser firefox() {
        driver = new FirefoxDriver();
        return new DriverRemoteBrowser();
    }

    public static DriverRemoteBrowser internetExplorer() {
        driver = new InternetExplorerDriver();
        return new DriverRemoteBrowser();
    }

    public static WebDriver en(String url) {
        driver.get(url);
        return driver;
    }

}
