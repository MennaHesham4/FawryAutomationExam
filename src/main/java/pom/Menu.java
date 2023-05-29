package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Menu {
    private WebDriver driver;
    private By burgermenu= By.id("nav-hamburger-menu");
    private By container= By.id("hmenu-content");
   private By seeall= By.xpath("//*[@class=\"hmenu-item hmenu-compressed-btn\"]");
    private By vediogame= By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[11]/a");
    private By allvediogame= By.linkText("All Video Games");


    public Menu (WebDriver driver){
        this.driver=driver;
    }
    public void clickonmenu(){
        driver.findElement(burgermenu).click();
    }


    public VideoGamePage selectvediogame () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(seeall));
        element.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(vediogame));
        element1.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(allvediogame));
        element2.click();
        return new VideoGamePage(driver);
    }


}
