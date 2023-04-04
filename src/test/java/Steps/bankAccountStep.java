package Steps;

import com.uphf.but2.BankManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class bankAccountStep {

    private com.uphf.but2.BankManager bankManager;
    private int montant;
    @Given("Un nouveau compte bancaire 1 est cree avec un solde initial de 1000")
    public void jesuissurlapagedepot(){
        System.out.println("page depot");
        bankManager = new BankManager(1000);
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
