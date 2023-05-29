package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VideoGamePage {
    private WebDriver driver;
    private By freeshipping =By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div[1]/label/i");

    public VideoGamePage (WebDriver driver){
        this.driver=driver;
    }
    public Results clickfreeshipping(){
        driver.findElement(freeshipping).click();
        return new Results(driver);
    }

}

