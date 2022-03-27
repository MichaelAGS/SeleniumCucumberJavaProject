Feature: Probar búsqueda en Google

#Scenario: Busco informacion en Google
#    Given navego a google
#    When busco informacion
#    Then obtengo resultados*

Scenario: As a user I enter a search criteria in Google
    Given I am on the Google search page
    When I enter a search criteria
    And click on the search button
    Then the result march the criteria