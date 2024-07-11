package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {

    public WebDriver ldriver;

    public SearchCustomerPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }


    @FindBy(name = "SearchEmail")
    WebElement txtEmailSearch;

    @FindBy(name = "SearchFirstName")
    WebElement txtFirstNameSearch;

    @FindBy(name = "SearchCompany")
    WebElement txtCompanySearch;


    @FindBy(id = "search-customers")
    WebElement btnSearch;

    // Actions & Methods

    public void setTxtEmailSearch(String emailSearch) {
        txtEmailSearch.clear();
        txtEmailSearch.sendKeys(emailSearch);

    }

    public void setTxtFirstNameSearch(String firstNameSearch) {
        txtFirstNameSearch.clear();
        txtFirstNameSearch.sendKeys(firstNameSearch);
    }

    public void setTxtCompanySearch(String companySearch) {
        txtCompanySearch.clear();
        txtCompanySearch.sendKeys(companySearch);
    }

    public void ClickSearch()  throws InterruptedException{
        btnSearch.click();
        Thread.sleep(4000);
    }

}
