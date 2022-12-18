package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.compareList;
import pages.wishingList;

public class compareListStepDefinition {
    compareList compareList=new compareList();
    String expectedTitle=compareList.productTitleOnHomePage().getText();
    @When("user click on the add to compareList button")
    public void clickOnCompareListIcon()
    {
        compareList.compareListIcon().click();
    }
    @Then("The successful message shows that the product added successfully to compareList")
    public void successfulAddingMessage()
    {
        String expectedMessage="The product has been added to your product comparison";
        String actualMessage= wishingList.successfulMessage().getText();
        Hooks.soft.assertTrue(actualMessage.contains(expectedMessage));

        String expectedMessageColor="rgba(75, 176, 122, 1)";
        String actualMessageColor=wishingList.successfulMessage().getCssValue("background-color");
        Hooks.soft.assertEquals(actualMessageColor,expectedMessageColor);
        Hooks.soft.assertAll();
    }
    @And("The product added successfully to compareList")
    public void successfulAddingToCompareList() throws InterruptedException {
        compareList.compareListPage().click();
        Thread.sleep(2000);
        //System.out.print(expectedTitle);
        String actualTitle= compareList.productTitleOnCompareList().getText();
        Hooks.soft.assertTrue(actualTitle.contains(expectedTitle));
        Hooks.soft.assertAll();
    }
}
