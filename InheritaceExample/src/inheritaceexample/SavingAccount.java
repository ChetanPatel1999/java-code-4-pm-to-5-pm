package inheritaceexample;

public class SavingAccount implements Account {

    public void createAccount() {
        System.out.println("saving Account is created");
    }

    public void deleteAccount() {
      
        System.out.println("saving Account is deleted");
    }

    public void interestCalculation() {
        System.out.println("saving account interest calculate");
    }

}
