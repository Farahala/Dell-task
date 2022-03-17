package StepDefinationFile;



import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.loginpage;
import  pages.hompage;
import pages.yourCart;

public class loginstepDef extends AbstractStepfile {

    WebDriver driver = getDriver();
    public loginpage ut;
   public hompage homep;
    String URL="https://www.saucedemo.com";

    @Given("I am on the login page of swage lab")
    public void i_am_on_the_login_page_of_the_Bank_appliaction() {
        driver.get(URL);
    }

    @When("I enter a vaild {string} and {string}")
    public void i_enter_a_vaild_certindalts(String Username , String Password) {



        ut=new loginpage(driver);
        homep =ut.vaildcertindalts(Username,Password);
    }


  /*  @After()
    public void quitBrowser() {
        driver.quit();

    }*/



}
