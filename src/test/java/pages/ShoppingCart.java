package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
    public WebElement addToCartButton()
    {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"1\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }
    public Select ramSelector()
    {
        return new Select(Hooks.driver.findElement(By.cssSelector("dd[id=\"product_attribute_input_2\"]>select[id=\"product_attribute_2\"]")));
    }
    public WebElement hddSelector()
    {
        return Hooks.driver.findElement(By.id("product_attribute_3_6"));
    }
    public WebElement addTCartConfirm()
    {
        return Hooks.driver.findElement(By.id("add-to-cart-button-1"));
    }
    public WebElement successfulMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
}
