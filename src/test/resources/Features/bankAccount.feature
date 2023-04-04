Feature: deposer argent

  @Depot
  Scenario: Compte 1
    Given Un nouveau compte bancaire 1 est cree avec un solde initial de 1000
    When Je depose 500 dans le compte 1
    Then Le solde du compte 1 est de 1500

    Scenario: Compte 3
      Given Creation du compte 3
      When je depose 1000
      And je retire 500
      Then Mon solde est a 500
