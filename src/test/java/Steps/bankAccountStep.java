package Steps;

import com.uphf.but2.BankManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

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


    @Then("Le solde du compte 1 est de 1500")
    public void jedevraisvoirunmessage(){
        System.out.println("THEN");
        assertEquals(bankManager.getBalance(1), 1500, 0);
    }


    @Given("Creation du compte 3")
    public void compte3cree(){
        bankManager.create(3);
    }

    @When("je depose 1000")
    public void depose1000(){
        bankManager.deposit(3, 1000);
    }

    @And("je retire 500")
    public void retire500(){
        bankManager.withdraw(3, 500);
    }

    @Then("Mon solde est a 500")
    public void solde500(){
        assertEquals(bankManager.getBalance(3), 499, 0);
    }
}
