package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.resetPage;

public class loginStepDefinition {
    loginPage loginPage=new loginPage();

    @Given("user navigate to login page")
    public void loginPage()
    {
        loginPage.logintab().click();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void validData(String email,String password)
    {
        loginPage.loginSteps(email,password);
    }
    @And("User click on login button")
    public void click_login_button() throws InterruptedException {
        loginPage.loginButton().click();
        Thread.sleep(3000);
    }
    @Then("User could login successfully and navigate to home page")
    public void login_successful()
    {
        Hooks.soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        boolean actualResult=loginPage.myAccountTab().isDisplayed();
        Hooks.soft.assertTrue(actualResult);
        Hooks.soft.assertAll();
    }
    @Then("User couldn't login successfully")
    public void login_fail()
    {
        String expectedResultText="Login was unsuccessful. Please correct the errors and try again.";
        String actualResultText=loginPage.errorMessage().getText();
        Hooks.soft.assertTrue(actualResultText.contains(expectedResultText));
        String expectedResultColor="rgba(228, 67, 75, 1)";
        String actualResultColor=loginPage.errorMessage().getCssValue("color");
        Hooks.soft.assertEquals(actualResultColor,expectedResultColor);
        Hooks.soft.assertAll();
    }




}
