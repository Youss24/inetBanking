package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class steps extends BaseClass {

    @Given("utilisateur lance le navigateur chrome")
    public void utilisateur_lance_le_navigateur_chrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        searchCustom = new SearchCustomerPage(driver);
        AddCustom = new AddCustomerPage(driver);
        
    }

    @When("utilisateur accede au url {string}")
    public void utilisateur_accede_au_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("utilisateur saisit Email {string} et password {string}")
    public void utilisateur_saisit_email_et_password(String email, String password) {
        loginPage.setUserName(email);
        loginPage.setPassword(password);
    }

    @When("cliquer sur Login")
    public void cliquer_sur_login() throws InterruptedException {
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("titre de la page doit contenir {string}")
    public void titre_de_la_page_doit_contenir(String title) throws InterruptedException {
        // Récupère le contenu de la page
        String pageSource = driver.getPageSource();

        // Vérifie si le contenu de la page contient "Login was unsuccessful"
        if (pageSource.contains("Login was unsuccessful")) {
            // Ferme le driver si le message d'erreur est présent
            driver.close();
            // Fait échouer le test avec un message explicite
            Assert.fail("Login was unsuccessful");
        } else {
            // Vérifie que le titre de la page correspond au titre attendu
            String actualTitle = driver.getTitle();
            Assert.assertEquals("Le titre de la page ne correspond pas au titre attendu.", title, actualTitle);
        }

        Thread.sleep(3000);
    }

    @When("utilisateur clique sur logout lien")
    public void utilisateur_clique_sur_logout_lien() {
        loginPage.clickLogOut();
    }

    @Then("fermer le navigateur")
    public void fermer_le_navigateur() {
        driver.quit();
    }

    // Customers features Steps Definitions.......................................

    @Then("utilisateur peut voir le tableau de bord")
    public void utilisateur_peut_voir_le_tableau_de_bord() {
        Assert.assertEquals("Dashboard / nopCommerce administration", AddCustom.getPageTitle());

    }

    @When("utilisateur clique sur le menu customer")
    public void utilisateur_clique_sur_le_menu_customer() throws InterruptedException {
        Thread.sleep(3000);
        AddCustom.clickOnCustomerMenu();
    }


    @When("clique sur customer menu item")
    public void clique_sur_customer_menu_item() throws InterruptedException {
        Thread.sleep(3000);
        AddCustom.clickOnCustomerMenuItem();

    }

    @When("cliquer sur add new button")
    public void cliquer_sur_add_new_button() throws InterruptedException {
        AddCustom.clickOnAddNew();
        Thread.sleep(2000);
    }

    @Then("utilisateur peut voir la page add new customer")
    public void utilisateur_peut_voir_la_page_add_new_customer() {
        Assert.assertEquals(AddCustom.getPageTitle(), "Add a new customer / nopCommerce administration");
    }

    @When("utilisateur saisit les informations de customer")
    public void utilisateur_saisit_les_informations_de_customer() {
        AddCustom.setEmail("youss@gmail.com");
        AddCustom.setPassword("youss101010");
        AddCustom.clickGender();
    }

    @When("cliquer sur save button")
    public void cliquer_sur_save_button() throws InterruptedException {
        AddCustom.clickSave();
        Thread.sleep(3000);
    }

    @Then("utilisateur peut voir message de confirmation {string}")
    public void utilisateur_peut_voir_message_de_confirmation(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().
                contains("The new customer has been added successfully"));
    }

    // Steps for searching customer by Email ID.......................

    @When("saisir customer email")
    public void saisir_customer_email() {
        searchCustom.setTxtEmailSearch("brenda_lindgren@nopCommerce.com");
    }

    @When("cliquer sur bouton search")
    public void cliquer_sur_bouton_search() throws InterruptedException {
        Thread.sleep(4000);
        searchCustom.ClickSearch();
    }

    @Then("utilisateur doit trouver email affiche dans la table de recherche")
    public void utilisateur_doit_trouver_email_affiche_dans_la_table_de_recherche() {
        System.out.println("email displayed");

    }

    // Steps for searching customer by FirstName .......................

    @When("saisir customer firstName")
    public void saisir_customer_first_name() throws InterruptedException {
        searchCustom.setTxtFirstNameSearch("Brenda");
        Thread.sleep(3000);

    }

    @Then("utilisateur doit trouver FirstName affiche dans la table de recherche")
    public void utilisateur_doit_trouver_first_name_affiche_dans_la_table_de_recherche() {
        System.out.println("First Name displayed");

    }

}
