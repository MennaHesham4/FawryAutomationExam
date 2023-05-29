package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;
    private By signinbutton= By.id("nav-link-accountList");

    public Home (WebDriver driver){
        this.driver=driver;
    }
    public SigninEmailPage clicksignin()
    { driver.findElement(signinbutton).click();
        return new SigninEmailPage(driver);
    }

}
