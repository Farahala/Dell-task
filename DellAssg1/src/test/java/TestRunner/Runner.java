package TestRunner;


import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginpage;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"StepDefinationFile"},
        plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class Runner  extends AbstractTestNGCucumberTests {


}
