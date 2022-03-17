package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class yourCart {
    WebDriver driver;
    By checkoutBtn = By.id("checkout");
    By DESCRIPTION=By.xpath("//div[contains(text(),'DESCRIPTION')]");

    public yourCart(WebDriver driver) {
        this.driver = driver;
    }

    public checkoutinfo checkoutItem() {
       WebDriverWait wait = new WebDriverWait(driver, 200);
      wait.until(ExpectedConditions.visibilityOf((driver.findElement(DESCRIPTION))));
        Assert.assertEquals(driver.findElement(DESCRIPTION).getText(),"DESCRIPTION");
        if (driver.findElement(checkoutBtn).isDisplayed()) {
            driver.findElement(checkoutBtn).click();
        }
        return new checkoutinfo(driver);
    }
}
