package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class checkoutinfo {
    By firestname= By.id("first-name");
    By lastname =By.id("last-name");
    By zipcode=By.id("postal-code");
    By conttn=By.id("continue");
    By finishBtn=By.name("finish");
    By backToHomeBtn=By.name("back-to-products");
    By Confrimation =By.xpath("//span[contains(text(),'Checkout: Complete!')]");
    By product=By.xpath("//span[contains(text(),\"Products\")]");
    WebDriver driver;
    checkoutinfo(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterfields(String FName , String LName ,String Zipcode)
    {
        driver.findElement(firestname).sendKeys(FName);
        driver.findElement(lastname).sendKeys(LName);
        driver.findElement(zipcode).sendKeys(Zipcode);
        driver.findElement(conttn).click();
    }
    public void finishshopping()  {

        driver.findElement(finishBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOf((driver.findElement(Confrimation))));
        Assert.assertEquals(driver.findElement(Confrimation).getText(),"CHECKOUT: COMPLETE!");

    }
    public void ReturntoHomepage()
    {
        driver.findElement(backToHomeBtn).click();
        Assert.assertEquals(driver.findElement(product).getText(),"PRODUCTS");
    }
}
