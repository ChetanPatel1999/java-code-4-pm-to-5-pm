package inheritaceexample;

public class CurrentAccount implements Account {

    public void createAccount() {
        System.out.println("Current account is created");
    }

    public void deleteAccount() {
        System.out.println("current account is deleted");
    }

    public void interestCalculation() {
        System.out.println("current account interest calculate");
    }

}
