package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninEmailPage {
    private WebDriver driver;
    private By emailtextfield= By.id("ap_email");
    private By continuebutton= By.id("continue");

    public SigninEmailPage (WebDriver driver){
        this.driver=driver;
    }
    public void writeemail (String email){
        driver.findElement(emailtextfield).sendKeys(email);
    }
    public SigninPasswordPage presscontinue (){
        driver.findElement(continuebutton).click();
        return new SigninPasswordPage(driver);
    }

}
