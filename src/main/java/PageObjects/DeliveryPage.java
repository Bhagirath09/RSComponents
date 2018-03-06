package PageObjects;

import RSComponents.LoadProp;
import RSComponents.Utils;
import org.openqa.selenium.By;

public class DeliveryPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _title = By.xpath("//select[@class=\"title formInput\"]");
    private By _firstName = By.xpath("//div[@class=\"formField top20 right30\"]/div/span/input");
    private By _county = By.xpath("//div[@class=\"formField\"]/div/div/span/div[2]/select");
    private By _surname = By.xpath("//div[@class=\"formField top20\"]/div/span/input");
    private By _teleNo= By.xpath("//div[@class=\"formField top20 right30\"]/div/span/div[2]/input");
    private By _companyYourName = By.xpath("//div[@class=\"grayBorderBox\"]/div/div/span/div[3]/div/div/span/input");
    private By _addressLine1 = By.xpath("//div[@class=\"grayBorderBox\"]/div/div/span/div[3]/div[3]/div/span/input");
    private By _town = By.xpath("//div[@class=\"grayBorderBox\"]/div/div/span/div[3]/div[5]/div/span/input");
    private By _postcode = By.xpath("//div[@class=\"grayBorderBox\"]/div/div/span/div[3]/div[7]/div/span/input");
//    private By _continueToPayment = By.xpath("div[@class=\"headerErrorWidgetContainer COM21\"]/div/span/a/span");
    private By _continueToPayment = By.id("checkoutSecurelyBtn");


    public String title = loadProp.getProperty("title");
    public String firstName = loadProp.getProperty("firstName");
    public String surname = loadProp.getProperty("surname");
    public String teleNo = loadProp.getProperty("telNo");
    public String addressLine1 = loadProp.getProperty("addressline1");
    public String town = loadProp.getProperty("town");
    public String county = loadProp.getProperty("county");
    public String postcode = loadProp.getProperty("postcode");

    public void fillOutDetailsOnDeliveryPage(){

        mySelectByVisibleText(_title,title);

        myEnterText(_firstName, firstName);

        myEnterText(_surname, surname);

        myEnterText(_teleNo, teleNo);

        //for company name using first name
        myEnterText(_companyYourName, firstName);

        myEnterText(_addressLine1, addressLine1);

        myEnterText(_town, town);

        mySelectByVisibleText(_county,county);

        myEnterText(_postcode, postcode);
    }

    public void clickContinueToPayment(){
        myClick(_continueToPayment);
    }


}
