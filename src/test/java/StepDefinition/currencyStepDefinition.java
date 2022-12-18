package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.homePage;

public class currencyStepDefinition {
    homePage currency=new homePage();
    @When("user select euro from the options")
    public void chooseEuro()
    {
        Select selectOption=new Select(currency.currencyChange());
        selectOption.selectByVisibleText("Euro");
    }
    @Then("all products price will turned to euro")
    public void price_changed_to_euro()
    {
        for (int i=0;i<currency.productPrices().size();i++)
        {
            String actualPrice=currency.productPrices().get(i).getText();
            Hooks.soft.assertTrue(actualPrice.contains("€"));
        }
    }
}
