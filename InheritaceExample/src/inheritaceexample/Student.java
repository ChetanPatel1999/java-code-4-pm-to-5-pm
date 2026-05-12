package inheritaceexample;

public abstract class Student {

    private String name;
    private int rno;
    private double fees;

    public void setStudent(String name, int rno, double fees) {
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

    abstract void result(int per);

}
