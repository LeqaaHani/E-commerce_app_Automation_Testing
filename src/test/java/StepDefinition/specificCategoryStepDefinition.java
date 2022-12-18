package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.homePage;

public class specificCategoryStepDefinition {
    homePage home=new homePage();
    @When("user hovers on a specific category")
    public void selectSpecificCategory() throws InterruptedException {
        Actions action=new Actions(Hooks.driver);
        Thread.sleep(2000);
        action.moveToElement(home.specificCategory()).perform();
    }
    @And("user select specific sub-category")
    public void selectSubCategory(){
        home.specificSubCategory().click();
    }
    @And("user select specific color")
    public void selectColor()
    {
    home.colorCheckBox().click();
    }
    @Then("user find the specific sub-category title in the page title")
    public void specificSubCategory_pageTitle()
    {
        String actualSubCategoryName=home.specificSubCategory().getText();
        String actualPageTitleName=home.pageTitle().getText();
        Hooks.soft.assertTrue(actualPageTitleName.contains(actualSubCategoryName));
    }
    @And("the specific products with specific color are shown")
    public void urlForSpecificProducts()
    {
      String actualURL=Hooks.driver.getCurrentUrl();
      Hooks.soft.assertTrue(actualURL.contains("specs=14"));
      Hooks.soft.assertAll();
    }

}
