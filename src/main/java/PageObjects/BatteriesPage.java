package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BatteriesPage extends Utils {


    int j = 0;

    public void findProductLocator(String rsNumber){

        By _findLocators = By.xpath("//div[@id=\"SRTNResultViewWidgetActionPAGE_REFRESH_EVENT\"]/table/tbody/tr");

        List<WebElement> elements = driver.findElements(_findLocators);

        for (int i=0; i<= elements.size(); i++){

            if (elements.get(i).getText().contains(rsNumber)){
                j = i+1;
                break;
            }
        }
    }

    public void enterProductQty(String qty){
        By _productQty = By.xpath("//div[@id=\"SRTNResultViewWidgetActionPAGE_REFRESH_EVENT\"]/table/tbody/tr["+j+"]/td/div/div[2]/ul/li[3]/form/div/div/input");
        clearText(_productQty);
        myEnterText(_productQty, qty);
    }


    public void clickAddQtyButton(){
        By _addQtyButton = By.xpath("//div[@id=\"SRTNResultViewWidgetActionPAGE_REFRESH_EVENT\"]/table/tbody/tr["+j+"]/td/div/div[2]/ul/li[3]/form/div/div[2]");
        myClick(_addQtyButton);
    }

    public void clickViewBasket(){
        By _viewBasket = By.xpath("//table[@class=\"srtnListTbl\"]/tbody/tr["+j+"]/td/div/div[2]/ul/li[3]/form/span/div[2]/span/a/span");
        myClick(_viewBasket);
    }

    public String productPrice(){
        By _productPrice = By.xpath("//table[@class=\"srtnListTbl\"]/tbody/tr["+j+"]/td/div/div[2]/ul/li[2]/span");
        String price = getText(_productPrice).replace('£', ' ').trim();
        return price;
    }

}
