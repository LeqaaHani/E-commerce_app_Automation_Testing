package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class resetPage {
    public WebElement forgetpasswordRef()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement forgetpasswordEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement recoverButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
    }
    public WebElement contentMSG()
    {
        return Hooks.driver.findElement(By.className("content"));
    }
    public void sendEmail(String email)
    {
        forgetpasswordEmail().sendKeys(email);
    }
}
