package class_object_example;

public class Student {

    private String name;
    private int rno;
    private double per;
    private static int totalStd;
    private static int totalPass;
    private static int totalFail;
    private static String instituteName = "HW Institute";

    void setStudent(String name, int rno, double per) {
        this.name = name;
        this.rno = rno;
        this.per = per;
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

//    void average(Student obj) {
//        double ave;
//        ave = (per + obj.per) / 2.0;
//        System.out.println("average : " + ave);
//    }
//
//    static void average(Student obj1, Student obj2) {
//        double ave;
//        ave = (obj1.per + obj2.per) / 2.0;
//        System.out.println("average : " + ave);
//    }
//
//    static void average(Student obj1, Student obj2, Student obj3) {
//        double ave;
//        ave = (obj1.per + obj2.per + obj3.per) / 3.0;
//        System.out.println("average : " + ave);
//    }
    static void average(Student... obj) {
        double sum = 0;
        for (Student s : obj) {
            sum = sum + s.per;
        }
        System.out.println("average = " + (sum / obj.length));
    }

    public boolean equals(Student obj) {
        if (name == obj.name && rno == obj.rno && per == obj.per) {
            return true;
        } else {
            return false;
        }

    }
}
