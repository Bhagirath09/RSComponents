package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class LEDTubeLights extends Utils {

private By _addSylvaniaToLEDQty = By.xpath("//tbody[@class=\"content\"]/tr[2]/td[3]/div[3]/div/input");
private By _addSylvaniaToLEDButton = By.xpath("//tbody[@class=\"content\"]/tr[2]/td[3]/div[3]/div/button");
private By _addSylvaniaToLEDAddedBasket = By.xpath("//div[@class=\"addToBasketMessageText\"]");


    public void addSylvaniaToLEDQuantity(String qty){
        scrollPage(0, 250);
        clearText(_addSylvaniaToLEDQty);
        myEnterText(_addSylvaniaToLEDQty, qty);
    }

    public void clickSylvaniaToLEDButton(){
        myClick(_addSylvaniaToLEDButton);
    }

    public void clickSylvaniaToLEDAddedBasket(){
        myClick(_addSylvaniaToLEDAddedBasket);
    }

}
