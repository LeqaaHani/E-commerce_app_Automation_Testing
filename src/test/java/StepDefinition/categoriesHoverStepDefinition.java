package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.homePage;

import java.util.Random;

public class categoriesHoverStepDefinition {

    homePage categoriesHover=new homePage();
    int category=new Random().nextInt(3);
    int subCategory=new Random().nextInt(3);
    @When("user hovers on a category")
    public void categoryHover()
    {
        Actions action=new Actions(Hooks.driver);
        action.moveToElement(categoriesHover.categoriesHover().get(category)).perform();
    }
    @And("user select sub-category")
    public void click_on_sub_category() throws InterruptedException {
        categoriesHover.subCategories(category).get(subCategory).click();
    }
    @Then("user find the sub-category title in the page title")
    public void subCategory_on_pageTitle()
    {
        String actualSubCategoryName=categoriesHover.subCategories(category).get(subCategory).getText();
        String actualPageTitleName=categoriesHover.pageTitle().getText();
        Hooks.soft.assertTrue(actualPageTitleName.contains(actualSubCategoryName));
    }

}
