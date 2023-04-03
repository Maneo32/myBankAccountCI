Feature: deposer argent

  @Depot
  Scenario Outline: Deposer avec succes
    Given je suis sur la page de depot avec un <solde> dans mon compte
    When je remplis le champ avec un <montant>
    And je clique sur Deposer
    Then je devrais voir un message de depot effectue avec succes et le solde <attendue>
    Examples:
      | solde | montant | attendue |
      | 10    | 100     | 110      |
      | 0    | 2000     | 2000      |