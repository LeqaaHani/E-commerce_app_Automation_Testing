package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.homePage;

public class tagsStepDefinition {
    homePage tags=new homePage();

    @Given("user go to searchPage")
    public void navigateToSearchPage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/search");
    }
    @When("user select hover on a tag from the popular tag section")
    public void hoverOnTag()
    {
        Actions action=new Actions(Hooks.driver);
        action.moveToElement(tags.tags()).perform();
    }
    @And("user click on the tag")
    public void clickOnTag()
    {
        tags.tags().click();
    }
    @Then("the products related to this tag will be shown")
    public void specifiedProducts()
    {
        String actualPageTitle=tags.pageTitle().getText();
        Hooks.soft.assertTrue(actualPageTitle.contains("apparel"));
        String actualURL=Hooks.driver.getCurrentUrl();
        Hooks.soft.assertTrue(actualURL.contains("apparel"));
        Hooks.soft.assertAll();
    }

}
