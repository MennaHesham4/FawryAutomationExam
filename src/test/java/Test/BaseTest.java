package Test;

import com.fasterxml.jackson.databind.Module;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void intialdriver() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @AfterClass
    public  void endsession(){driver.quit();}
}
