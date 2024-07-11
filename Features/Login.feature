Feature: se connecter
  Scenario: connexion reussie avec des informations d'identification valides
    Given utilisateur lance le navigateur chrome
    When utilisateur accede au url "https://admin-demo.nopcommerce.com/"
    And utilisateur saisit Email "admin@yourstore.com" et password "admin"
    And cliquer sur Login
    Then titre de la page doit contenir "Dashboard / nopCommerce administration"
    When utilisateur clique sur logout lien
    Then titre de la page doit contenir "Your store. Login"
    And fermer le navigateur


  Scenario Outline: Login Data Driven
    Given utilisateur lance le navigateur chrome
    When utilisateur accede au url "https://admin-demo.nopcommerce.com/"
    And utilisateur saisit Email "<email>" et password "<password>"
    And cliquer sur Login
    Then titre de la page doit contenir "Dashboard / nopCommerce administration"
    When utilisateur clique sur logout lien
    Then titre de la page doit contenir "Your store. Login"
    And fermer le navigateur

    Examples:
    |  email                 |  password          |
    | admin@yourstore.com    |  admin             |
    | admin100@yourstore.com |  admin123          |



