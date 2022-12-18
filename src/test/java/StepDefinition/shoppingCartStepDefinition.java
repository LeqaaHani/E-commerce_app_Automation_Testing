package StepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import pages.ShoppingCart;

public class shoppingCartStepDefinition {
    ShoppingCart shoppingCart=new ShoppingCart();
    @When("user click on the add to cart button")
    public void userChooseItemToCart()
    {
        shoppingCart.addToCartButton().click();
    }
    @And("choose the specified features of the product")
    public void chooseFeatures() throws InterruptedException {
        shoppingCart.ramSelector().selectByValue("3");
        Thread.sleep(1000);
        shoppingCart.hddSelector().click();
    }
    @And("confirm adding to shopping cart")
    public void confirmAdding()
    {
        shoppingCart.addTCartConfirm().click();
    }
    @Then("The product added successfully to shopping cart")
    public void successfulAdding()
    {
        String expectedMessage="The product has been added to your shopping cart";
        String actualMessage=shoppingCart.successfulMessage().getText();
        String expectedColor="rgba(75, 176, 122, 1)";
        String actualColor=shoppingCart.successfulMessage().getCssValue("background-color");
        Hooks.soft.assertEquals(actualColor,expectedColor);
        Hooks.soft.assertTrue(actualMessage.contains(expectedMessage));
        Hooks.soft.assertAll();

    }


}
