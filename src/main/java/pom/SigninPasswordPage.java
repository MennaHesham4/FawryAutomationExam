package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPasswordPage {
    private WebDriver driver;
    private By passwordtextfield= By.id("ap_password");
    private By signInSubmit= By.id("signInSubmit");

    public SigninPasswordPage (WebDriver driver){
        this.driver=driver;
    }
    public void writepassword (String password){
        driver.findElement(passwordtextfield).sendKeys(password);
    }
    public Menu SignInSubmitbutton (){
        driver.findElement(signInSubmit).click();
        return new Menu(driver);
    }

}

