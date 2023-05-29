package Test;

import org.testng.annotations.Test;
import pom.*;

public class ScenarioTest extends BaseTest{
    //please write your email and password at the following strings to start automate your scenario
    String email ="";
    String password="";
    String sort="Price: High to Low";
    @Test
    public void testE2EScenario(){
        Home home=new Home(driver);
        home.clicksignin().writeemail(email);
        SigninEmailPage signinEmailPage=new SigninEmailPage(driver);
        signinEmailPage.presscontinue().writepassword(password);
        SigninPasswordPage signinPasswordPage=new SigninPasswordPage(driver);
        signinPasswordPage.SignInSubmitbutton().clickonmenu();
        Menu menu=new Menu(driver);
        menu.selectvediogame().clickfreeshipping().addnewfilter().SortfromHightoLow(sort).additemtocart();
        AddtoCart addtoCart=new AddtoCart(driver);
        addtoCart.Checkmycart().proceedtobuy();
    }
}
