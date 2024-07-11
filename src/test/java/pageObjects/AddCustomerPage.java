package pageObjects;

import StepsDefinitions.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage  {

    public WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
    WebElement lnkCustomers_menu;

    @FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
    WebElement lnkCustomers_menu_item;

    @FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a")
    WebElement btnAddNew;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement txtEmail;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement txtPassword  ;

    @FindBy(xpath = "//*[@id=\"Gender_Male\"]")
    WebElement btnMale  ;

    @FindBy(xpath = "/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
    WebElement btnSave  ;

    // Actions & Methods

    public String getPageTitle(){
        return ldriver.getTitle();
    }

    public void clickOnCustomerMenu(){
        lnkCustomers_menu.click();
    }

    public void clickOnCustomerMenuItem(){
        lnkCustomers_menu_item.click();
    }

    public void clickOnAddNew(){
        btnAddNew.click();
    }

    public void setEmail(String email){
        txtEmail.sendKeys("yass@gmail.com");
    }

    public void setPassword(String password){
        txtPassword.sendKeys("yass123");
    }

    public void clickGender(){
        btnMale.click();
    }

    public void clickSave(){
        btnSave.click();
    }

}
