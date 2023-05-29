package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AddtoCart {
    private WebDriver driver;
    private By addbutton=By.id("add-to-cart-button");
    private By checkout=By.id("proceed-to-checkout-action");
    private By cartbutton=By.id("nav-cart");
   // Select locator for all items that price under 15k
    private By prices=By.xpath("//span[@class='a-price-whole' and translate(., ',', '') < 15000]/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 sg-col-12-of-24 s-list-col-right']");

    public AddtoCart (WebDriver driver){
        this.driver=driver;
    }


    public void additemtocart() {
        List<WebElement> items = driver.findElements(prices);
        List<String> productLinks = new ArrayList<>();
        //this loop iterate webelements and get link for each one
        for (WebElement item : items) {
            WebElement productLink = item.findElement(By.tagName("a"));
            productLinks.add(productLink.getAttribute("href"));
        }
        //this loop avoid staleexeption from using 2 backwords navigation, then click each link to add to cart
        for (String link : productLinks) {
            driver.get(link);
            driver.findElement(addbutton).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart-count")));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("nav-cart-count"), "1"));

            driver.navigate().back();
            driver.navigate().back();
        }
    }
    public PlaceOrder Checkmycart(){
        driver.findElement(cartbutton).click();
        return new PlaceOrder(driver);
    }


}








  /* public void additemtocart(){
        List<WebElement> items =driver.findElements(prices);
        for(WebElement item:items){
            WebElement productLink = item.findElement(By.tagName("a"));
            productLink.click();
            driver.findElement(addbutton).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("nav-cart-count"), "1"));
            driver.navigate().back();
        }
        driver.navigate().back();
    }*/
