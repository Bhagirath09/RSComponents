package PageObjects;

import RSComponents.Utils;
import org.openqa.selenium.By;

public class InsulationTesterPage extends Utils {

    private By _resultPerPage = By.id("rpp-button");
    private By _perPage20 = By.xpath("//div[@class=\"col-xs-12 noPaddingCol paginatonArea\"]/div[2]/div/div/ul/li[1]/a");
    private By _perPage50 = By.xpath("//div[@class=\"col-xs-12 noPaddingCol paginatonArea\"]/div[2]/div/div/ul/li[2]/a");
    private By _perPage100 = By.xpath("//div[@class=\"col-xs-12 noPaddingCol paginatonArea\"]/div[2]/div/div/ul/li[3]/a");

    private By _brandFilter = By.xpath("//div[@id=\"filters\"]/div/div/rs-facets/a");
    private By _meggerCheckBox = By.xpath("//div[@class=\"attributesContainer\"]/span/div[11]/label/span");
    private By _applyFilterButton = By.xpath("//div[@class=\"filter-container\"]/div/rs-facets/div/div[2]/div/div[6]/rs-apply-button/button");
    private By _sortPriceAscending = By.xpath(".//*[starts-with(@id, 'results-table-header-container')]/table/thead/tr[2]/th[3]/div/button");


    public void clickResultPerPageFilter(){
        myClick(_resultPerPage);
    }

    public void clickBrandFilter(){
        myClick(_brandFilter);
    }

    public void clickMeggerCheckBox(){
        myClick(_meggerCheckBox);
    }

    public void clickApplyFilterButton(){
        scrollPage(0,200);
    myClick(_applyFilterButton);
    }

    public void clickSortPriceAscendingButton(){
        myClick(_sortPriceAscending);
    }

    public void selectResultPerPage (String perPage){
    if(perPage.contains("20")){
        myClick(_perPage20);
    }
    else if (perPage.contains("50")){
        myClick(_perPage50);
    }
    else if (perPage.contains("100")){
        myClick(_perPage100);
    }
}
}
