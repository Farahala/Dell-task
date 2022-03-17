package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import  pages.hompage;

public class loginpage {
    WebDriver driver ;
    By username=By.id("user-name");
    By pass=By.id("password");
    By loginbtn=By.id("login-button");
    By product=By.xpath("//span[contains(text(),\"Products\")]");
    public loginpage(WebDriver driver)

    {this.driver=driver;

    }

    public hompage vaildcertindalts(String Username,String Password ){
        driver.findElement(username).sendKeys(Username);
        driver.findElement(pass).sendKeys(Password);
        driver.findElement(loginbtn).click();
        Assert.assertEquals(driver.findElement(product).getText(),"PRODUCTS");
        return new hompage(driver);
    }
}

