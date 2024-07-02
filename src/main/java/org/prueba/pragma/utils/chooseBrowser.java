package org.prueba.pragma.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class chooseBrowser {

    public static WebDriver driver;

    public static chooseBrowser web(String browser) {
        chooseBrowser a = new chooseBrowser();
        switch (browser) {
            case "CHROME":
                a = browserChrome(browser);

                break;

            case "FIREFOX":
                a = browserFirefox(browser);

                break;

            case "EDGE":
                a = browserEdge(browser);
                break;

            default:
                System.out.println("DON´T EXIST THIS BROWSER");
                break;
        }
        return a;

    }

    public static chooseBrowser browserChrome(String browser) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        HashMap<String, Object> preferences = new HashMap<String, Object>();
        preferences.put("profile.default_content_settings.popups", 0);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        return new chooseBrowser();

    }

    public static chooseBrowser browserFirefox(String browser) {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("geo.prompt.testing", true);
        profile.setPreference("geo.prompt.testing.allow", true);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--private");
        options.addArguments("--marionette");
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.private.browsing.autostart", true);
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        return new chooseBrowser();

    }

    public static chooseBrowser browserEdge(String browser) {
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");

        EdgeDriverService service = EdgeDriverService.createDefaultService();

        driver = new EdgeDriver();

        return new chooseBrowser();

    }

}
