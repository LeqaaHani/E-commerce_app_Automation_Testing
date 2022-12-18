package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.wishingList;

public class wishlistStepDefinition {
    wishingList wishingList=new wishingList();
    String expectedTitle=wishingList.elementTitleOnHomePage().getText();
    @When("user click on the add to wishlist button")
    public void clickOnWishlistIcon()
    {
     wishingList.wishList().click();
    }
    @Then("The successful message shows that the product added successfully")
    public void successfulAddingMessage()
    {
        String expectedMessage="The product has been added to your wishlist";
        String actualMessage=wishingList.successfulMessage().getText();
        Hooks.soft.assertTrue(actualMessage.contains(expectedMessage));

        String expectedMessageColor="rgba(75, 176, 122, 1)";
        String actualMessageColor=wishingList.successfulMessage().getCssValue("background-color");
        Hooks.soft.assertEquals(actualMessageColor,expectedMessageColor);
        Hooks.soft.assertAll();
    }
    @And("The product added successfully to wishlist")
    public void successfulAddingToWishList() throws InterruptedException {
        wishingList.closeNotification().click();
        wishingList.wishlistButton().click();
        Thread.sleep(2000);
        //System.out.print(expectedTitle);
        String actualTitle= wishingList.elementTitleOnWishList().getText();
        Hooks.soft.assertTrue(actualTitle.contains(expectedTitle));
        Hooks.soft.assertAll();
    }

}
