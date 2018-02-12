package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class LightingPage extends Utils {

    private By _LEDLamps = By.linkText("LED Lamps");

    public void clickLEDLamps(){
    myClick(_LEDLamps);
    }
}
