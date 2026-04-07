package class_object_example;

public class StudentUser {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setStudent("ram", 101, 23);
        s2.setStudent("shyam", 102, 98);
        s3.setStudent("madhav", 103, 56);
        s4.setStudent("rupesh", 104, 75);
        
        s1.getResultCard();
        s2.getResultCard();
        s3.getResultCard();
        s4.getResultCard();
        
        
        Student.getTotalStud();
        
        
        Student.getTotalResult();
        
        Student.classInfo();
    }

}
