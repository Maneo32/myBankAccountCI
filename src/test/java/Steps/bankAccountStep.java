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
        bankManager = new BankManager();
        bankManager.create(1);
        bankManager.deposit(1, 1000);
    }

    @When("Je depose 500 dans le compte 1")
    public void jeremplislechamp(int mont){
        System.out.println("je remplis");
        bankManager.deposit(1, 500);
    }


    @Then("je devrais voir un message de depot effectue avec succes et le solde {int}")
    public void jedevraisvoirunmessage(int solde){
        System.out.println("THEN");
        assertEquals(bankManager.getBalance(1), 1500, 0);
    }
}
