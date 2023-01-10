package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();

        student1.setInfo("Uros",'M',28,2210,'A');

        Student student2 = new Student();
        student2.setInfo("Milso",'M',30,2211,'A');
        Student student3 = new Student();
        student3.setInfo("Milena",'F',28,2290,'B');
        Student student4 = new Student();
        student4.setInfo("Dzafer",'M',38,2280,'F');
        Student student5 = new Student();
        student5.setInfo("Marta",'F',22,2270,'D');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);



        }


        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A') {
                earlyBirds.add(student);
            }else {angryBirds.add(student);}
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
