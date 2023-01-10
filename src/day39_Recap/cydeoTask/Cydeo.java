package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {


        Developer developer = new Developer("Uros", 28, 'M', 1234, "Developer", 12500000);

        Tester tester = new Tester("Neko", 29, 'F', 12382, "SDET", 123213);

        Teacher teacher = new Teacher("Ne", 54, 'F', 1245582, "Math Teacher", 1235213);

        Student student = new Student("Suhaib", 30, 'M', 12321, "QA");


        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        teacher.work();
        developer.work();
        tester.work();
        System.out.println("-------------------------------");
        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-------------------------------");

    }
}
