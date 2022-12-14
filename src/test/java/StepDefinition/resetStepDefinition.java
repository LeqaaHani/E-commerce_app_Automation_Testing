package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.resetPage;

public class resetStepDefinition {
    pages.resetPage resetPage=new resetPage();
    @When("user click on forgetPassword")
    public void resetPage()
    {
        resetPage.forgetpasswordRef().click();
    }
    @Then("^user navigate to forgetPage and enter his email \"(.*)\"$")
    public void recoveryMail(String email)
    {
        resetPage.sendEmail(email);
    }
    @And("user click on Recovery Button")
    public void recoverButton()
    {
        resetPage.recoverButton().click();
    }
    @And("password will be reset")
    public void success()
    {
        String expectedResultText="Email with instructions has been sent to you.";
        String actualResultText=resetPage.contentMSG().getText();
        Hooks.soft.assertEquals(actualResultText,expectedResultText);
    }
    @And("password will not be reset")
    public void fail()
    {
        String expectedResultText="Email not found.";
        String actualResultText=resetPage.contentMSG().getText();
        Hooks.soft.assertEquals(actualResultText,expectedResultText);
    }
}
