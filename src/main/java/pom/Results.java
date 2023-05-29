package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Results {
    private WebDriver driver;
    private By newlink =By.linkText("New");
    private By sortby =By.id("s-result-sort-select");
    public Results (WebDriver driver){
        this.driver=driver;
    }
    public Results addnewfilter(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(newlink));
        element.click();
        return new Results(driver);
    }
    public AddtoCart SortfromHightoLow(String choose){
        Select select=new Select(driver.findElement(sortby));
        select.selectByVisibleText(choose);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new AddtoCart(driver);

    }
}
