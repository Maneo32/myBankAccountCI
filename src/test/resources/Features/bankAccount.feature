Feature: deposer argent

  @Depot
  Scenario Outline: Deposer avec succes
    Given Un nouveau compte bancaire 1 est cree avec un solde initial de 1000
    When Je depose 500 dans le compte 1
    Then Le solde du compte 1 est de 1500
    Examples:
      | solde | montant | attendue |
      | 10    | 100     | 110      |
      | 0    | 2000     | 2000      |

    Scenario Outline: