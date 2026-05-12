package inheritaceexample;

import java.util.LinkedList;

public class UniversityUser {

    public static void main(String[] args) {
        EngStd s1 = new EngStd();
        s1.setStudent("ram sharma", 101, 150000);
        s1.setEng(4, "CSE");
        s1.getStudent();
        s1.getEngStudent();
        s1.result(25);

        MediStd s2 = new MediStd();
        s2.setStudent("raj varma", 102, 450000);
        s2.setMedi(3, "artho");
        s2.getStudent();
        s2.getMediStudent();
        s2.result(39);
        
        Student obj;
        obj= new EngStd();
        obj= new MediStd();
        
        Object o1;
        o1=new EngStd();
        o1=new MediStd();
        o1=new Student1("ram",101,56000);
       
    }
}
