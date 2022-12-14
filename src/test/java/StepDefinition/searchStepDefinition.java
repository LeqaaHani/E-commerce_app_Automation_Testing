package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.searchPage;

public class searchStepDefinition {
    searchPage searchPage=new searchPage();

    @When("user click on search field")
    public void searchFieldClick()
    {
        searchPage.searchField().click();
    }
    @And("user enter the product name")
    public void searchButtonClick()
    {
        searchPage.searchField().sendKeys("book");
        searchPage.searchButton().click();
    }
    @Then("user find the product in the search result")
    public void searchResult()
    {
        //First Assertion
        SoftAssert soft=new SoftAssert();
        String expectedResultURL="https://demo.nopcommerce.com/search?q=";
        String actualResultURL=Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResultURL.contains(expectedResultURL));
        for (int i=0;i<searchPage.searchProductItem().size();i++)
        {
            String item = searchPage.searchProductItem().get(i).getText().toLowerCase();
            soft.assertTrue(item.contains("book"));
        }
        soft.assertAll();
    }
}
