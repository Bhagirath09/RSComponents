package PageObjects;

import RSComponents.LoadProp;
import RSComponents.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaymentPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _paymentType = By.name("paymentType");
    private By _cardNumber1 = By.xpath("//div[@class=\"leftDiv\"]/div/div/span/input[2]");
    private By _cardNumber2 = By.xpath("//div[@class=\"leftDiv\"]/div/div/span/input[3]");
    private By _cardNumber3 = By.xpath("//div[@class=\"leftDiv\"]/div/div/span/input[4]");
    private By _cardNumber4 = By.xpath("//div[@class=\"leftDiv\"]/div/div/span/input[5]");
    private By _cardName = By.xpath("//div[@class=\"leftDiv\"]/div[2]/div/span/div/input");
    private By _cardHolderName = By.xpath("//div[@class=\"leftDiv\"]/div[3]/div/span/input");
    private By _expiryDate = By.xpath("//div[@class=\"leftDiv\"]/div[4]/div/span/input");
    private By _securityDate = By.xpath("//div[@class=\"leftDiv\"]/div[5]/div/span/div/input");
    private By _continueToOrderReview = By.xpath("//div[@class=\"checkoutNavigationContainer COM73\"]/span/a/span");
    private By _companyYourName = By.xpath("//div[@class=\"grayBorderBox\"]/div/div[3]/table/tbody/tr/td[2]/div/div/div/span/input");

    public String cardNumber1 = loadProp.getExcelProperty(0,13,1);
    public String cardNumber2 = loadProp.getExcelProperty(0,14,1);
    public String cardNumber3 = loadProp.getExcelProperty(0,15,1);
    public String cardNumber4 = loadProp.getExcelProperty(0,16,1);
    public String cardName = loadProp.getExcelProperty(0,17,1);
    public String cardHolderName = loadProp.getExcelProperty(0,18,1);
    public String expiryDate = loadProp.getExcelProperty(0,19,1);
    public String securityDate = loadProp.getExcelProperty(0,20,1);
    public String firstName = loadProp.getExcelProperty(0,6,1);


    public void fillPaymentCardDetails(){

        try {
            ifAlertIsPresent();
        }catch (TimeoutException e){};


        myEnterText(_companyYourName, firstName);
        myEnterText(_cardNumber1, cardNumber1);
        myEnterText(_cardNumber2, cardNumber2);
        myEnterText(_cardNumber3, cardNumber3);
        myEnterText(_cardNumber4, cardNumber4);

        myEnterText(_cardName, cardName);
        myEnterText(_cardHolderName, cardHolderName);
        myEnterText(_expiryDate, expiryDate);
        myEnterText(_securityDate, securityDate);

    }

    public void clickContinueToOrderReview(){
        myClick(_continueToOrderReview);
    }

    public void clickPaymentCardRadioButton(String cardType){

    List<WebElement> chkBx_paymentType = driver.findElements(_paymentType);

    if(cardType.contains("Visa")){
        chkBx_paymentType.get(0).click();
    }
    else if(cardType.equalsIgnoreCase("Mastercard")){
        chkBx_paymentType.get(1).click();

    }
    else if(cardType.contains("AmericanExpress")){
        chkBx_paymentType.get(2).click();
    }
    else if(cardType.contains("RS")){
        chkBx_paymentType.get(3).click();

    } else {
        System.out.println("Wrong Card Name typed");

    }
}

}
