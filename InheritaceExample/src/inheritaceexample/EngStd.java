package inheritaceexample;

public class EngStd extends Student {

    private int sem;
    private String branch;

    public void setEng(int sem, String branch) {
        this.sem = sem;
        this.branch = branch;

    }

    public void getEngStudent() {
        System.out.println("Student sem : " + sem);
        System.out.println("Student branch : " + branch);
    }

    void result(int per) {
        if (per > 23) {
            System.out.println("student pass");
        } else {
            System.out.println("student fail");
        }
    }
}
