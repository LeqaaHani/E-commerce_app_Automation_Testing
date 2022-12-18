package pages;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homePage {
    //ResetPassword
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
    /********************************************/
    //Search
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement> searchProductItem()
    {
        List<WebElement>list=Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
        return list;
    }
    /********************************************/
    //Currency
    public WebElement currencyChange()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement>productPrices()
    {
        List<WebElement>productprices=Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productprices;
    }
    /********************************************/
    //Categories
    public List<WebElement> categoriesHover()
    {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li"));
    }
    public List<WebElement> subCategories(int category)
    {
        category=category+1;
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li:nth-child("+category+")>ul[class=\"sublist first-level\"]>li"));
    }
    public WebElement specificCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement specificSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
    public WebElement colorCheckBox()
    {
        return Hooks.driver.findElement(By.id("attribute-option-14"));
    }
    public WebElement pageTitle()
    {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    /********************************************/
    //Tags
    public WebElement tags()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel-2\"]"));
    }

}
