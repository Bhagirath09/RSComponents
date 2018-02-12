package RSComponents;

import PageObjects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    LightingPage lightingPage = new LightingPage();
    LEDLampsPage ledLampsPage = new LEDLampsPage();
    LEDTubeLights ledTubeLights = new LEDTubeLights();
    MyBasketPage myBasketPage = new MyBasketPage();
    DeliveryPage deliveryPage = new DeliveryPage();
    PaymentPage paymentPage = new PaymentPage();
    NewProducts newProducts = new NewProducts();
    BatteriesPage batteriesPage = new BatteriesPage();
    ElectricalInstallationTesting electricalInstallationTesting = new ElectricalInstallationTesting();
    InsulationTesterPage insulationTesterPage = new InsulationTesterPage();
    SoftAssert softAssert = new SoftAssert();



    String actual, actualQuantity, actualProduct, actualPayment, actualPrice;
    static String cardType, harwinQty, harwinRSNumber, sylvaniaLEDQty, sylvaniaLEDRSNumber, searchProduct,
                  perPage;


        @Given("^user is on homepage$")
    public void userIsOnHomepage()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^the page should display (\\d+) navigation categories$")
    public void thePageShouldDisplayNavigationCategories(int arg0)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on \"([^\"]*)\" category$")
    public void userClicksOnCategory(String category)  {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnAnyCategory(category);
    }

    @And("^clicks on Lighting category$")
    public void clicksOnLightingCategory()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickLighting();
        actual = driver.findElement(By.xpath("//div[@class=\"categoryTitleDiv\"]/h1")).getText();
        actual =driver.getTitle();
        Assert.assertTrue(actual.contains("Lighting"));
    }

    @And("^clicks on LED Lamps$")
    public void clicksOnLEDLamps()  {
        // Write code here that turns the phrase above into concrete actions
        lightingPage.clickLEDLamps();
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains("LED Lamps"));
    }

    @And("^clicks on LED Tube Lights$")
    public void clicksOnLEDTubeLights()  {
        // Write code here that turns the phrase above into concrete actions
        ledLampsPage.clickLEDTubeLights();
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains("LED Tube Lights"));

    }

    @Then("^user should be navigated to LED Tube Lights page$")
    public void userShouldBeNavigatedToLEDTubeLightsPage()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^user should see different type of Lights$")
    public void userShouldSeeDifferentTypeOfLights()  {
        // Write code here that turns the phrase above into concrete actions

    }


    @And("^user can see different type of lights$")
    public void userCanSeeDifferentTypeOfLights()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user puts two \"([^\"]*)\" Sylvania ToLEDo, RS Stock No(\\d+)-(\\d+) in quantity$")
    public void userPutsTwoSylvaniaToLEDoRSStockNoInQuantity()  {
        // Write code here that turns the phrase above into concrete actions

    }


    @When("^user puts two \"([^\"]*)\" Sylvania ToLEDo, RS Stock No \"([^\"]*)\" in quantity$")
    public void userPutsTwoSylvaniaToLEDoRSStockNoInQuantity(String sylvaniaLEDQty, String sylvaniaLEDRSNumber)  {
        // Write code here that turns the phrase above into concrete actions
        this.sylvaniaLEDQty = sylvaniaLEDQty;
        this.sylvaniaLEDRSNumber = sylvaniaLEDRSNumber;
        ledTubeLights.addSylvaniaToLEDQuantity(sylvaniaLEDQty);
    }



    @And("^clicks Add button$")
    public void clicksAddButton()  {
        // Write code here that turns the phrase above into concrete actions
        ledTubeLights.clickSylvaniaToLEDButton();
    }

    @And("^clicks Added View Basket$")
    public void clicksAddedViewBasket()  {
        // Write code here that turns the phrase above into concrete actions
        ledTubeLights.clickSylvaniaToLEDAddedBasket();
    }

    @Then("^user should be navigated to My basket page$")
    public void userShouldBeNavigatedToMyBasketPage()  {
        // Write code here that turns the phrase above into concrete actions
        actual = driver.findElement(By.xpath("//div[@class=\"pageTitleBlack\"]")).getText();
        Assert.assertTrue(actual.contains("My basket"));
    }

    @And("^user should see that same lights are added in basket$")
    public void userShouldSeeThatSameLightsAreAddedInBasket() {
        // Write code here that turns the phrase above into concrete actions
        actualProduct = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[2]/div[2]/span[2]")).getText();
        Assert.assertTrue(actualProduct.contains(sylvaniaLEDRSNumber));

        actualQuantity = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[3]/input")).getAttribute("value");
        Assert.assertTrue(actualQuantity.contains(sylvaniaLEDQty));

        actualPrice = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[5]/div")).getText();
        Assert.assertTrue(actualPrice.contains("£28.60"));

        }


    @And("^user clicks on Checkout Securely$")
    public void userClicksOnCheckoutSecurely()  {
        // Write code here that turns the phrase above into concrete actions
        myBasketPage.clickCheckoutSecurely();
    }

    @And("^user enters email to continue as a guest$")
    public void userEntersEmailToContinueAsAGuest()  {
        // Write code here that turns the phrase above into concrete actions
        myBasketPage.enterEmailAsGuest();
    }

    @And("^clicks on Guest checkout$")
    public void clicksOnGuestCheckout()  {
        // Write code here that turns the phrase above into concrete actions
        myBasketPage.clickGuestCheckout();
    }

    @Then("^user should be navigated to Delivery page$")
    public void userShouldBeNavigatedToDeliveryPage()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user enters all mandatory information on delivery page$")
    public void userEntersAllMandatoryInformationOnDeliveryPage()  {
        // Write code here that turns the phrase above into concrete actions
        deliveryPage.fillOutDetailsOnDeliveryPage();
    }

    @And("^clicks on Continue to payment$")
    public void clicksOnContinueToPayment()  {
        // Write code here that turns the phrase above into concrete actions
        deliveryPage.clickContinueToPayment();
    }

    @Then("^user should be navigated to Payment page$")
    public void userShouldBeNavigatedToPaymentPage() {
        // Write code here that turns the phrase above into concrete actions
        actual = driver.findElement(By.xpath("//div[@class=\"deliveryHeaderDiv\"]/span")).getText();
        Assert.assertTrue(actual.contains("Payment"));
    }


    @When("^user selects \"([^\"]*)\" as Card Type$")
    public void userSelectsAsCardType(String cardType) {
        // Write code here that turns the phrase above into concrete actions
        this.cardType = cardType;
        paymentPage.clickPaymentCardRadioButton(cardType);
    }

    @And("^enters all mandatory information$")
    public void entersAllMandatoryInformation()  {
        // Write code here that turns the phrase above into concrete actions
        paymentPage.fillPaymentCardDetails();
    }



    @And("^clicks on Continue to order review$")
    public void clicksOnContinueToOrderReview()  {
        // Write code here that turns the phrase above into concrete actions
        paymentPage.clickContinueToOrderReview();
    }

    @Then("^user should be navigated to Order review page$")
    public void userShouldBeNavigatedToOrderReviewPage()  {
        // Write code here that turns the phrase above into concrete actions
        actual = driver.findElement(By.xpath("//div[@class=\"deliveryHeaderDiv\"]/span")).getText();
        Assert.assertTrue(actual.contains("Review"));
    }


       @And("^should see all order details$")
    public void shouldSeeAllOrderDetails()  {
        // Write code here that turns the phrase above into concrete actions

        //assert delivery address, payment details and products are same
        actual = driver.findElement(By.xpath("//div[@class=\"formValue\"]")).getText();

           Assert.assertTrue(actual.contains(deliveryPage.firstName) &&
                                       actual.contains(deliveryPage.addressLine1) &&
                                       actual.contains(deliveryPage.town) &&
                                       actual.contains(deliveryPage.county) &&
                                       actual.contains(deliveryPage.postcode));


        actualPayment = driver.findElement(By.xpath("//div[@class=\"formField\"]/span[2]")).getText();
        Assert.assertTrue(actualPayment.contains(cardType) &&
                                    actualPayment.contains(paymentPage.cardName) &&
                                    actualPayment.contains(paymentPage.cardNumber4) );


        actualProduct = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[2]/div/div/span[2]")).getText();
        Assert.assertTrue(actualProduct.contains(sylvaniaLEDRSNumber));

           actualQuantity = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[3]")).getText();
           Assert.assertTrue(actualQuantity.contains(sylvaniaLEDQty));

           actualPrice = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[5]/div")).getText();
           Assert.assertTrue(actualPrice.contains("£28.60"));


        }

    @When("^user clicks on Place order button$")
    public void userClicksOnPlaceOrderButton()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should be able to place an order successfully$")
    public void userShouldBeAbleToPlaceAnOrderSuccessfully()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^should see \"([^\"]*)\" message after completing Checkout$")
    public void shouldSeeMessageAfterCompletingCheckout(String arg0)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^clicks on Batteries category$")
    public void clicksOnBatteriesCategory()  {
        // Write code here that turns the phrase above into concrete actions
        newProducts.clickBatteries();
    }

    @Then("^user should be navigated to Batteries page$")
    public void userShouldBeNavigatedToBatteriesPage()  {
        // Write code here that turns the phrase above into concrete actions
        actual = driver.getTitle();
//        Assert.assertTrue(actual.contains("Batteries"));
    }

    @And("^user should see different type of Batteries$")
    public void userShouldSeeDifferentTypeOfBatteries()  {
        // Write code here that turns the phrase above into concrete actions
    }


    @When("^user puts two \"([^\"]*)\" HARWIN Coin Cell Batter Holder, RS Stock No \"([^\"]*)\" in quantity$")
    public void userPutsTwoHARWINCoinCellBatterHolderRSStockNoInQuantity(String harwinQty, String harwinRSNumber)  {
        // Write code here that turns the phrase above into concrete actions
        this.harwinQty = harwinQty;
        this.harwinRSNumber = harwinRSNumber;
        batteriesPage.enterHarwinBatteryHolderQty(harwinQty);
    }



    @And("^clicks HARWIN Battery Holder Quantity Add button$")
    public void clicksHARWINBatteryHolderQuantityAddButton()  {
        // Write code here that turns the phrase above into concrete actions
        batteriesPage.clickHarwinBatteryHolderQty();
    }

    @And("^clicks HARWIN Battery Holder View Basket$")
    public void clicksHARWINBatteryHolderViewBasket()  {
        // Write code here that turns the phrase above into concrete actions
        batteriesPage.clickViewBasketHarwinBatteryHolder();
    }

    @And("^user should see that same Battery Holders are added in basket$")
    public void userShouldSeeThatSameBatteryHoldersAreAddedInBasket()  {
        // Write code here that turns the phrase above into concrete actions
        actualProduct = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[2]/div[2]/span[2]")).getText();
        Assert.assertTrue(actualProduct.contains(harwinRSNumber));
        actualQuantity = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[3]/input")).getAttribute("value");
        Assert.assertTrue(actualQuantity.contains(harwinQty));
        actualPrice = driver.findElement(By.xpath("//table[@class=\"cartTable\"]/tbody/tr[3]/td[5]/div")).getText();
        Assert.assertTrue(actualPrice.contains("£8.52"));
    }

    @And("^should see all order details HARWIN Battery Holder$")
    public void shouldSeeAllOrderDetailsHARWINBatteryHolder()  {
        // Write code here that turns the phrase above into concrete actions

        //assert delivery address, payment details and products are same
        actual = driver.findElement(By.xpath("//div[@class=\"formValue\"]")).getText();
        Assert.assertTrue(actual.contains(deliveryPage.firstName) &&
                                    actual.contains(deliveryPage.addressLine1) &&
                                    actual.contains(deliveryPage.town) &&
                                    actual.contains(deliveryPage.county) &&
                                    actual.contains(deliveryPage.postcode));


        actualPayment = driver.findElement(By.xpath("//div[@class=\"formField\"]/span[2]")).getText();
        Assert.assertTrue(actualPayment.contains(cardType) &&
                                    actualPayment.contains(paymentPage.cardName) &&
                                    actualPayment.contains(paymentPage.cardNumber4));

        actualProduct = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[2]/div/div/span[2]")).getText();
        Assert.assertTrue(actualProduct.contains(harwinRSNumber));

        actualQuantity = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[3]")).getText();
        Assert.assertTrue(actualQuantity.contains(harwinQty));

        actualPrice = driver.findElement(By.xpath("//div[@class=\"orderlinesContainer\"]/div/table/tbody/tr[4]/td[5]/div")).getText();
        Assert.assertTrue(actualPrice.contains("£8.52"));

    }

    //===================================================================================//

    @When("^user enters \"([^\"]*)\" in search box$")
    public void userEntersInSearchBox(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterTexInSearchBox();
    }

    @And("^clicks search button$")
    public void clicksSearchButton()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickSearchButton();
    }

    @Then("^user should be navigated to tester product category page$")
    public void userShouldBeNavigatedToTesterProductCategoryPage()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see different types of testers in categories$")
    public void userShouldSeeDifferentTypesOfTestersInCategories()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        electricalInstallationTesting.clickInsulationTester();
    }

    @Then("^user should be navigated to Insulation Testers page$")
    public void userShouldBeNavigatedToInsulationTestersPage()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^user should see different types of Insulation Tester$")
    public void userShouldSeeDifferentTypesOfInsulationTester()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see different filters such as Results per page, Price, Minimum Test Voltage etc$")
    public void userShouldSeeDifferentFiltersSuchAsResultsPerPagePriceMinimumTestVoltageEtc()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^user is on Insulation Tester page$")
    public void userIsOnInsulationTesterPage()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.enterTexInSearchBox();
        homePage.clickSearchButton();
        electricalInstallationTesting.clickInsulationTester();
    }

    @And("^user can see different type of search filters$")
    public void userCanSeeDifferentTypeOfSearchFilters()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on Results per page filter$")
    public void userClicksOnResultsPerPageFilter()  {
        // Write code here that turns the phrase above into concrete actions
        insulationTesterPage.clickResultPerPageFilter();
    }

    @And("^selects \"([^\"]*)\"$")
    public void selects(String perPage)  {
        // Write code here that turns the phrase above into concrete actions
        this.perPage = perPage;
        insulationTesterPage.selectResultPerPage(perPage);
    }

    @Then("^(\\d+) products should be displayed on page$")
    public void productsShouldBeDisplayedOnPage(int arg0)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^\"([^\"]*)\" products should be displayed on page$")
    public void productsShouldBeDisplayedOnPage(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        try {
            ifAlertIsPresent();
        }catch (TimeoutException e){};
        By _elements = By.xpath("//div[@class=\"resultsTable results-table-container\"]/table/tbody/tr/td/div/figure/a");
        List<WebElement> elementList = driver.findElements(_elements);

        int perPageInt = Integer.parseInt(perPage);
        Assert.assertEquals(elementList.size(),perPageInt);

    }

    @When("^user clicks on Brand filter$")
    public void userClicksOnBrandFilter()  {
        // Write code here that turns the phrase above into concrete actions
        insulationTesterPage.clickBrandFilter();
    }

    @And("^selects Megger checkbox$")
    public void selectsMeggerCheckbox()  {
        // Write code here that turns the phrase above into concrete actions
        insulationTesterPage.clickMeggerCheckBox();
    }

    @And("^clicks Apply filters$")
    public void clicksApplyFilters()  {
        // Write code here that turns the phrase above into concrete actions
        insulationTesterPage.clickApplyFilterButton();
    }

    @Then("^user should see only Megger products on page$")
    public void userShouldSeeOnlyMeggerProductsOnPage()  {

        // Write code here that turns the phrase above into concrete actions

        try {
            ifAlertIsPresent();
        }catch (TimeoutException e){};

        List<WebElement> elementList = driver.findElements(By.xpath(".//*[starts-with(@class, 'product-name')]"));

        for (int i = 0; i < elementList.size(); i++) {
           softAssert.assertTrue(elementList.get(i).getText().contains("Megger"), elementList.get(i).getText()+" is not Megger product");
        }
        softAssert.assertAll();
    }

    @When("^user clicks on sort ascending price filter$")
    public void userClicksOnSortAscendingPriceFilter()  {
        // Write code here that turns the phrase above into concrete actions
        insulationTesterPage.clickSortPriceAscendingButton();
    }

    @Then("^all products should be sorted in price ascending order$")
    public void allProductsShouldBeSortedInPriceAscendingOrder()  {

        // Write code here that turns the phrase above into concrete actions

        try {
            ifAlertIsPresent();
        }catch (TimeoutException e){};
        List<WebElement> price = driver.findElements(By.xpath(".//*[starts-with(@id, 'results-table')]/tbody/tr/td[3]/div/span"));

        List<String> priceList = new ArrayList<String>();

        for (int i = 0; i<price.size(); i++) {
            priceList.add(price.get(i).getText());
            priceList.remove(String.valueOf("Each"));
        }

        // make a copy of the list
        List<String> sortedPrices = new ArrayList<String>(priceList);

        // sort the list
        Collections.sort(sortedPrices);

        if (!sortedPrices.equals(priceList)){
            Assert.fail("Prices are not in asceding order");
        }
    }

}
