package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchPage {
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement>searchProductItem()
    {
        List<WebElement>list=Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
        return list;
    }

}
