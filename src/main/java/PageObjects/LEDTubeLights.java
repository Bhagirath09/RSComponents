package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LEDTubeLights extends Utils {

    int j = 0;

    public void findProductLocator(String rsNumber){

        By _findLocators = By.xpath("//div[@class=\"resultsTable results-table-container\"]/table/tbody/tr/td[2]/div[2]/a");

        List<WebElement> elements = driver.findElements(_findLocators);

        for (int i=0; i<= elements.size(); i++){

            if (elements.get(i).getText().contains(rsNumber)){
                j = i+1;
                break;
            }
        }
    }

    public void enterProductQty(String qty){
        By _productQty = By.xpath("//tbody[@class=\"content\"]/tr["+j+"]/td[3]/div[3]/div/input");
        clearText(_productQty);
        myEnterText(_productQty, qty);
    }


    public void clickAddQtyButton(){
        By _addQtyButton = By.xpath("//tbody[@class=\"content\"]/tr["+j+"]/td[3]/div[3]/div/button");
        myClick(_addQtyButton);
    }

    public void clickAddedViewBasket(){
        By _viewBasket = By.xpath("//div[@class=\"addToBasketMessageText\"]");
        myClick(_viewBasket);
    }

    public String productPrice(){
        By _productPrice = By.xpath("//tbody[@class=\"content\"]/tr["+j+"]/td[3]/div/span");
        String price = getText(_productPrice).replace('£', ' ').trim();
        return price;
    }

}
