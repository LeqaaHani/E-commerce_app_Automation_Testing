package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.currencyPage;

public class currencyStepDefinition {
    currencyPage currencyPage=new currencyPage();
    @When("user select euro from the options")
    public void chooseEuro()
    {
        Select selectOption=new Select(currencyPage.currencyChange());
        selectOption.selectByVisibleText("Euro");
    }
    @Then("all products price will turned to euro")
    public void price_changed_to_euro()
    {
        for (int i=0;i<currencyPage.productPrices().size();i++)
        {
            String actualPrice=currencyPage.productPrices().get(i).getText();
            Assert.assertTrue(actualPrice.contains("€"));
        }
    }
}
