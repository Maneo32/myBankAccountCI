package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class bankAccountStep {

    private BankAccountManager bankManager = new BankAccountManager();
    private double avant1;
    private double avant2;

    @Given("Un nouveau compte bancaire 1 est cree avec un solde initial de 1000")
    public void jesuissurlapagedepot(){
        System.out.println("page depot");
        bankManager.create();
        bankManager.deposit(1, 1000);
    }

    @When("Je depose 500 dans le compte 1")
    public void jeremplislechamp(){
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
        bankManager.create();
    }

    @When("je depose 1000")
    public void depose1000(){
        bankManager.deposit(0, 1000);
    }

    @And("je retire 500")
    public void retire500(){
        bankManager.withdraw(0, 500);
    }

    @Then("Mon solde est a 500")
    public void solde500(){
        assertEquals(501, bankManager.getBalance(0), 0.01);
    }

    @When("cpt 3 donne {int}")
    public void donne(int value){
        avant1 = bankManager.getBalance(0);
        bankManager.withdraw(0, value);
    }

    @And("cpt 1 recoit {int}")
    public void recoit(int value){
        avant2 = bankManager.getBalance(1);
        bankManager.deposit(1, value);
    }

    @Then("verif les veleurs de cpt1 et 3")
    public void verif(){

    }
}
