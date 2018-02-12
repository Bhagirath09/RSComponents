package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class NewProducts extends Utils {

    private By _batteries = By.linkText("Batteries");

    public void clickBatteries(){
        myClick(_batteries);
    }

}
