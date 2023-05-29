package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrder {

        private WebDriver driver;
        private By buy=By.id("proceed-to-checkout-action");

        public PlaceOrder (WebDriver driver){
            this.driver=driver;
        }
        public void proceedtobuy (){
            driver.findElement(buy).click();
        }
    }


