package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class wishingList {

    public WebElement wishList()
    {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]>div[class=\"details\"]>div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement wishlistButton()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]"));
    }
    public static WebElement successfulMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement closeNotification()
    {
        return Hooks.driver.findElement(By.className("close"));
    }
    public WebElement elementTitleOnHomePage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"details\"]>h2[class=\"product-title\"]>a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }
    public WebElement elementTitleOnWishList()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
    }
}
