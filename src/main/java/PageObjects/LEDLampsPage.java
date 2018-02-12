package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class LEDLampsPage extends Utils {

    private By _LEDTubeLights = By.linkText("LED Tube Lights");

    public void clickLEDTubeLights(){
    myClick(_LEDTubeLights);
    }

}
