package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class compareList {
    public WebElement compareListIcon()
    {
       return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"43\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 add-to-compare-list-button\"]"));
    }
    public WebElement compareListPage()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }
    public WebElement productTitleOnCompareList()
    {
        return Hooks.driver.findElement(By.cssSelector("tr[class=\"product-name\"] >td >a[href=\"/25-virtual-gift-card\"]"));
    }
    public WebElement productTitleOnHomePage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"details\"]>h2[class=\"product-title\"]>a[href=\"/25-virtual-gift-card\"]"));
    }
}
