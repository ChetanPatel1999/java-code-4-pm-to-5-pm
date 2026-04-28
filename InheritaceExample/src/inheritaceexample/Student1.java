package inheritaceexample;

class Student1 {

    private String name;
    private int rno;
    private double fees;

    public Student1(String name, int rno, double fees) {
        this.name = name;
        this.rno = rno;
        this.fees = fees;
    }

    public void getStudent() {
        System.out.println("Student info : ");
        System.out.println("Student name : " + name);
        System.out.println("Student rno : " + rno);
        System.out.println("Student fees : " + fees);
    }

    void result(int per) {
        if (per > 33) {
            System.out.println("student pass");
        } else {
            System.out.println("student fail");
        }
    }

}

class EngStd1 extends Student1 {

    private int sem;
    private String branch;

    EngStd1(String name, int rno, double fees, int sem, String branch) {
        super(name, rno, fees);
        this.sem = sem;
        this.branch = branch;

    }

    public void getEngStudent() {
        getStudent();
        System.out.println("Student sem : " + sem);
        System.out.println("Student branch : " + branch);
    }
}

class myClass {

    public static void main(String[] args) {
        EngStd1 s1 = new EngStd1("raj", 101, 5600, 4, "CSE");
        s1.getEngStudent();
    }

}
