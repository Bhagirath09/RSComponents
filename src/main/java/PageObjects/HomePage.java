package PageObjects;

import RSComponents.LoadProp;
import RSComponents.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _allProducts = By.xpath("//div[@class=\"headerContainer\"]/div/ul/li/a");
    private By _ourBrands = By.xpath("//div[@class=\"headerContainer\"]/div/ul/li[2]/a");
    private By _newProducts = By.xpath("//div[@class=\"headerContainer\"]/div/ul/li[3]/a");
    private By _lighting = By.linkText("Lighting");
    private By _searchBox = By.id("searchTerm");
    private By _searchBoxButton = By.xpath("//div[@class=\"searchContainer\"]/form/i");

    String searchProduct = loadProp.getExcelProperty(0,25,1);

    public void clickAllProducts(){
        myClick(_allProducts);
    }

    public void clickOurBrands(){
        myClick(_ourBrands);
    }

    public void clickNewProducts(){
        myClick(_newProducts);
    }


    public void clickLighting(){
        myClick(_lighting);
    }

    public void enterTexInSearchBox(){
        myEnterText(_searchBox,searchProduct );
    }

    public void clickSearchButton(){
        driver.findElement(_searchBox).sendKeys(Keys.ENTER);
    }

    public void clickOnAnyCategory(String category){

        if(category.contains("All Products")){
            clickAllProducts();
        }
        else if(category.contains("Our Brands")){
           clickOurBrands();
        }
        else if(category.contains("New Products")){
            clickNewProducts();
        }
    }



    }


