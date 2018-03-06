package PageObjects;

import RSComponents.LoadProp;
import RSComponents.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public class MyBasketPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _checkoutSecurelyButton = By.xpath("//span[@class=\"toggleBtnState\"]/a/span");
    private By _emailGuest = By.xpath("//div[@class=\"formField top10\"]/div/span/div[2]/input");
    private By _guestCheckout = By.id("guestCheckoutForm:guestCheckout");

    String email = loadProp.getProperty("email");

    public void clickCheckoutSecurely(){

        myClick(_checkoutSecurelyButton);
    }

    public void enterEmailAsGuest(){
        try {
            ifAlertIsPresent();
        }catch (TimeoutException e){};

        myEnterText(_emailGuest, email);
    }

    public void clickGuestCheckout(){
        myClick(_guestCheckout);
    }

}
