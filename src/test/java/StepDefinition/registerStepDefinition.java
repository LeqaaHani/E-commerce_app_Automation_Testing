package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.registerPage;

public class registerStepDefinition {
        registerPage registerPage=new registerPage();
        @Given("User go to register page")
    public void go_to_registerPage()
        {
            registerPage.registertab().click();
        }
        @When("User select the type of gender")
    public void choose_gender()
    {
        registerPage.female_RB().click();
    }
        @And("User enter the first and last name")
    public void enter_first_last_name()
    {
        registerPage.firstName().sendKeys("leqaa");
        registerPage.lastName().sendKeys("hani");
    }
    @And("User enter the date of birth")
    public void date_of_birth()
    {
        registerPage.dayDropDownList().selectByValue("18");
        registerPage.monthDropDownList().selectByValue("3");
        registerPage.yearDropDownList().selectByValue("1998");
    }
    @And("User enter the email")
    public void email()
    {
        registerPage.email().sendKeys("leqaahani@example.com");
    }
    @And("User enter and confirm the password")
    public void password_confirm()
    {
        registerPage.password().sendKeys("123456");
        registerPage.passwordConfirm().sendKeys("123456");
    }
    @And("User click on register button")
    public void register_button() throws InterruptedException {
        registerPage.registerButton().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("success message is displayed")
    public void success_register()
    {
        String expectedResultText="Your registration completed";
        String actualResultText=registerPage.result().getText();
        Hooks.soft.assertEquals(actualResultText,expectedResultText);
        String expectedResultColor="rgba(76, 177, 124, 1)";
        String actualResultColor=registerPage.result().getCssValue("color");
        Hooks.soft.assertEquals(actualResultColor,expectedResultColor);
        Hooks.soft.assertAll();
    }



}
