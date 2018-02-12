package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class BatteriesPage extends Utils {

    private By _harwinBatteryHolderQty = By.xpath("//div[@id=\"SRTNResultViewWidgetActionPAGE_REFRESH_EVENT\"]/table/tbody/tr[4]/td/div/div[2]/ul/li[3]/form/div/div/input");
    private By _harwinBatteryHolderAddButton = By.xpath("//div[@id=\"SRTNResultViewWidgetActionPAGE_REFRESH_EVENT\"]/table/tbody/tr[4]/td/div/div[2]/ul/li[3]/form/div/div[2]");
    private By _viewBasketHarwinBatteryHolder = By.xpath("//table[@class=\"srtnListTbl\"]/tbody/tr[4]/td/div/div[2]/ul/li[3]/form/span/div[2]/span/a/span");


    public void enterHarwinBatteryHolderQty(String qty){
        clearText(_harwinBatteryHolderQty);
        myEnterText(_harwinBatteryHolderQty, qty);
    }

    public void clickHarwinBatteryHolderQty(){
        myClick(_harwinBatteryHolderAddButton);
    }

    public void clickViewBasketHarwinBatteryHolder(){
        myClick(_viewBasketHarwinBatteryHolder);
    }


}
