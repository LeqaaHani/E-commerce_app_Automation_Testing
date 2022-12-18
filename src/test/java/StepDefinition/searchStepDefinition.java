package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.homePage;

public class searchStepDefinition {
    homePage search=new homePage();

    @When("user click on search field")
    public void searchFieldClick()
    {
        search.searchField().click();
    }
    @And("user enter the product name")
    public void searchButtonClick()
    {
        search.searchField().sendKeys("book");
        search.searchButton().click();
    }
    @Then("user find the product in the search result")
    public void searchResult()
    {
        //First Assertion
        String expectedResultURL="https://demo.nopcommerce.com/search?q=";
        String actualResultURL=Hooks.driver.getCurrentUrl();
        Hooks.soft.assertTrue(actualResultURL.contains(expectedResultURL));
        for (int i=0;i<search.searchProductItem().size();i++)
        {
            String item = search.searchProductItem().get(i).getText().toLowerCase();
            Hooks.soft.assertTrue(item.contains("book"));
        }
        Hooks.soft.assertAll();
    }
}
