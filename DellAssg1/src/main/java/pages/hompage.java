package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class hompage {
    WebDriver driver;
    WebDriverWait wait;
    yourCart yourcartpage;
   By addToCartBtn=By.xpath("//button[contains(text(),\"Add to cart\")]") ;
   By shopping_cart_badge=By.xpath("//span[@class='shopping_cart_badge']");
   int addeditem=0;
    public hompage (WebDriver driver){
        this.driver= driver;
    }
    public void addToCart()
    {
        List<WebElement> listofItems = driver.findElements(addToCartBtn);
        WebDriverWait wait = new WebDriverWait(driver, 20); //Wait time of 20 seconds
         addeditem=listofItems.size();
        for (int i=0;i<=listofItems.size()-1;i++)
        {
            wait.until(ExpectedConditions.visibilityOf(listofItems.get(i)));
            listofItems.get(i).click();
        }


    }
    public yourCart cartbadge()
    { String numberofAddedItems= driver.findElement(shopping_cart_badge).getText();
        System.out.println(Integer.parseInt(numberofAddedItems));
        System.out.println(addeditem);
      //  Assert.assertEquals(Integer.parseInt(numberofAddedItems), addeditem);

        driver.findElement(shopping_cart_badge).click();
        return new yourCart(driver);
    }
}
