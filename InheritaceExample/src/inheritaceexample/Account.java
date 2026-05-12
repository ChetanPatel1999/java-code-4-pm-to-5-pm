package inheritaceexample;

public interface Account {

    int TOTAL_ACCOUNT_LIMIT = 100; //by default public static final 

    private static void m1() {
        System.out.println("its m1 static method");
    }

    static void m2() {
        m1();
        System.out.println("its m2 static method");
    }

    default void m3() //concrete method
    {
        System.out.println("its m3 concrete method");
    }

    void createAccount();  // by default public abstract method

    void deleteAccount();

    void interestCalculation();

}
