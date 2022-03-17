package StepDefinationFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbstractStepfile {
    protected static WebDriver driver;

    protected WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().setup();
            driver =(new ChromeDriver(getChromeOptions()));
            driver.manage().window().maximize();
        }
return  driver;

    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--lang=en-GB");
        return options;
    }
}
