package class_object_example;

public class Student {

    private String name;
    private int rno;
    private double per;
    private static int totalStd;
    private static int totalPass;
    private static int totalFail;
    private static String instituteName = "HW Institute";

    void setStudent(String n, int r, double p) {
        name = n;
        rno = r;
        per = p;
        totalStd++;
        if (per > 33) {
            totalPass++;
        } else {
            totalFail++;
        }
    }

    void getResultCard() {
        System.out.println("Student Result Card .....");
        System.out.println("Student institue : " + instituteName);
        System.out.println("Student name : " + name);
        System.out.println("Student rno : " + rno);
        System.out.println("Student per : " + per);
        if (per > 33) {
            System.out.println("student pass ....");
        } else {
            System.out.println("student Fail.....");
        }
        System.out.println("----------------------------------------\n");
    }

    static void getTotalStud() {
        System.out.println("total student : " + totalStd);
        System.out.println("----------------------------------------\n");
    }

    static void getTotalResult() {
        System.out.println("total student pass : " + totalPass);
        System.out.println("total student Fail : " + totalFail);
        System.out.println("----------------------------------------\n");
    }

    static void classInfo() {
        System.out.println("this is student class");
        System.out.println("here are many methods");
    }
}
