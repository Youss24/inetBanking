package StepsDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
    public WebDriver driver;
    public LoginPage loginPage;
    public AddCustomerPage AddCustom;
    public SearchCustomerPage searchCustom;

    public static String randomstring(){
        String generateString1 = RandomStringUtils.randomAlphabetic(5);
        return (generateString1);
    }
}
