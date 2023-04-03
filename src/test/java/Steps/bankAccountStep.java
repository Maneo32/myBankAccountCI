package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class bankAccountStep {

    private BankAccount bankAccount;
    private int montant;
    @Given("je suis sur la page de depot avec un {int} dans mon compte")
    public void jesuissurlapagedepot(int solde){
        System.out.println("page depot");
        bankAccount = new BankAccount(solde);
    }

    @When("je remplis le champ avec un {int}")
    public void jeremplislechamp(int mont){
        System.out.println("je remplis");
        montant = mont;
    }

    @And("je clique sur Deposer")
    public void jecliquesurdeposer(){
        System.out.println("je clique");
        bankAccount.deposit(montant);
    }

    @Then("je devrais voir un message de depot effectue avec succes et le solde {int}")
    public void jedevraisvoirunmessage(int solde){
        System.out.println(bankAccount.checkBalance());
        assertEquals(solde, bankAccount.checkBalance(), 0);
    }
}
