package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public void createTicket(){
        System.out.println(getJobTitle() + " " + " is creating a ticket");


    }

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is working");
    }
}
