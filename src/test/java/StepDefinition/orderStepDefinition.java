package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.order;

public class orderStepDefinition {
    order order=new order();
    @When("user click on shopping cart button")
    public void shoppingCartButton()
    {
        order.shoppingCartButton().click();
    }
    @And("accept the terms of service")
    public void acceptTerms()
    {
        order.acceptTerms().click();
    }
    @And("click on checkout button")
    public void checkoutButton()
    {
        order.checkoutButton().click();
    }
    @And("enter his data")
    public void personalData() throws InterruptedException {
        Thread.sleep(1000);
        order.country().selectByValue("123");
        order.state().selectByValue("0");
        order.city().sendKeys("Damietta");
        order.address().sendKeys("Damietta");
        order.postalCode().sendKeys("0");
        order.phoneNumber().sendKeys("0");
        Thread.sleep(1000);
        order.continueButton1().click();
    }
    @And("choose shipping method")
    public void shippingMethod()
    {
        order.continueButton2().click();
    }
    @And("choose payment method")
    public void paymentMethod()
    {
        order.continueButton3().click();
    }
    @And("choose payment information")
    public void paymentInformation()
    {
        order.continueButton4().click();
    }
    @And("confirm the order")
    public void confirmOrder()
    {
        order.confirmButton().click();
    }
    @Then("the order will make successfully")
    public void successfulOrder()
    {
        String expectedMessage="Your order has been successfully processed!";
        String actualMessage=order.title().getText();
        Hooks.soft.assertTrue(actualMessage.contains(expectedMessage));
    }


}
