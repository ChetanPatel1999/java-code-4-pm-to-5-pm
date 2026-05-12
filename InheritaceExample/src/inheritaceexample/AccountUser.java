package inheritaceexample;

public class AccountUser {

    public static void main(String[] args) {
        Account ac1, ac2;

        System.out.println(Account.TOTAL_ACCOUNT_LIMIT);
        
        Account.m2();
  
        ac1 = new SavingAccount();
        ac2 = new CurrentAccount();

        ac1.createAccount();
        ac1.deleteAccount();
        ac1.interestCalculation();

        ac2.createAccount();
        ac2.deleteAccount();
        ac2.interestCalculation();
        
        ac1.m3();

    }
}
