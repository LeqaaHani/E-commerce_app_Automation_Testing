package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {

    public WebElement logintab()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\""));
    }
    public WebElement myAccountTab()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public WebElement errorMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

    public void loginSteps(String email,String password)
    {
        email().sendKeys(email);
        password().sendKeys(password);
    }



}
