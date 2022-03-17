package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.checkoutinfo;
import pages.hompage;
import pages.yourCart;

public class HomepagestepDef extends AbstractStepfile {
    WebDriver driver= getDriver();
    hompage homep= new hompage(driver);
    yourCart yourcartpage;
    checkoutinfo checkoutpage;
    @Then("add item to cart")
    public void additemtocart(){
        homep.addToCart();
        yourcartpage= homep.cartbadge();
    }
    @Then ("user can checkout")
    public void userCan_Checkout()  {
        checkoutpage= yourcartpage.checkoutItem();
    }
    @Then("fill {string} and {string} and {string} to Continue checkout")
    public void FillData(String FName,String LName ,String ZipCode)  {
                checkoutpage.enterfields(FName, LName, ZipCode);
                checkoutpage.finishshopping();
            }

      @Then("return to the home page")
    public void ReturnTohome()
            {
checkoutpage.ReturntoHomepage();
            }
}
