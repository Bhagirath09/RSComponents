package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class ReviewPage extends Utils {

private By _placeOrderButton = By.xpath("//div[@class=\"checkoutNavigationContainer COM73\"]/span/a/span");

public void clickPlaceOrderButton(){
    myClick(_placeOrderButton);
}
}
