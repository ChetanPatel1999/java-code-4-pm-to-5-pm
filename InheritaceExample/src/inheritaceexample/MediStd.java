package inheritaceexample;

public class MediStd extends Student {

    private int prof;
    private String speci;

    public void setMedi(int prof, String speci) {
        this.prof = prof;
        this.speci = speci;

    }

    public void getMediStudent() {
        System.out.println("Student prof : " + prof);
        System.out.println("Student speci : " + speci);
    }

    void result(int per) {
        if (per> 40) {
            System.out.println("student pass");
        } else {
            System.out.println("student fail");
        }
    }
}
