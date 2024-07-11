Feature: Customers
  Background: Below are the commons steps for each scenario
    Given utilisateur lance le navigateur chrome
    When utilisateur accede au url "https://admin-demo.nopcommerce.com/"
    And utilisateur saisit Email "admin@yourstore.com" et password "admin"
    And cliquer sur Login
    Then utilisateur peut voir le tableau de bord

  Scenario: Add new Customer
    When utilisateur clique sur le menu customer
    And clique sur customer menu item
    And cliquer sur add new button
    Then utilisateur peut voir la page add new customer
    When utilisateur saisit les informations de customer
    And cliquer sur save button
    Then utilisateur peut voir message de confirmation "The new customer has been added successfully"
    And fermer le navigateur

  Scenario: Search customer by EmailId
    When utilisateur clique sur le menu customer
    And clique sur customer menu item
    And saisir customer email
    When cliquer sur bouton search
    Then utilisateur doit trouver email affiche dans la table de recherche
    And fermer le navigateur

  Scenario: Search customer by FirstName
    And clique sur customer menu item
    And saisir customer firstName
    When cliquer sur bouton search
    Then utilisateur doit trouver FirstName affiche dans la table de recherche
    And fermer le navigateur








