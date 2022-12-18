package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class resetStepDefinition {
    homePage reset=new homePage();
    @When("user click on forgetPassword")
    public void resetPage()
    {
        reset.forgetpasswordRef().click();
    }
    @Then("^user navigate to forgetPage and enter his email \"(.*)\"$")
    public void recoveryMail(String email)
    {
        reset.sendEmail(email);
    }
    @And("user click on Recovery Button")
    public void recoverButton()
    {
        reset.recoverButton().click();
    }
    @And("password will be reset")
    public void success()
    {
        String expectedResultText="Email with instructions has been sent to you.";
        String actualResultText=reset.contentMSG().getText();
        Hooks.soft.assertEquals(actualResultText,expectedResultText);
    }
    @And("password will not be reset")
    public void fail()
    {
        String expectedResultText="Email not found.";
        String actualResultText=reset.contentMSG().getText();
        Hooks.soft.assertEquals(actualResultText,expectedResultText);
    }
}
