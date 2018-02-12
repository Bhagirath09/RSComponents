package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class ElectricalInstallationTesting extends Utils {

//    private By _insulationTester = By.xpath("//td[@class=\"brLeftTd\"]/div/div/ul/li[10]/div/a");
    private By _insulationTester = By.linkText("Insulation Testers");

    public void clickInsulationTester(){
        myClick(_insulationTester);
    }
}
