package pages;


import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class order {

    public WebElement shoppingCartButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }
    public WebElement acceptTerms()
    {
        return Hooks.driver.findElement(By.id("termsofservice"));
    }
    public WebElement checkoutButton()
    {
        return Hooks.driver.findElement(By.id("checkout"));
    }
    public Select country()
    {
        return new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
    }
    public Select state()
    {
        return new Select(Hooks.driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
    }
    public WebElement city()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement address()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement postalCode()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phoneNumber()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement continueButton1()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 new-address-next-step-button\"]"));
    }
    public WebElement continueButton2()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    }
    public WebElement continueButton3()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
    }
    public WebElement continueButton4()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
    }
    public WebElement confirmButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
    }
    public WebElement title()
    {
        return Hooks.driver.findElement(By.className("title"));
    }
}
