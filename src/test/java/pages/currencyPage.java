package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class currencyPage {

    public WebElement currencyChange()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement>productPrices()
    {
        List<WebElement>productprices=Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productprices;
    }
}
