package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registerPage {


    public WebElement registertab()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement female_RB()
    {
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public Select dayDropDownList()
    {
        return new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
    }
    public Select monthDropDownList()
    {
        return new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
    }
    public Select yearDropDownList()
    {
        return new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
    }
    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement passwordConfirm()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
    }
    public WebElement result()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
