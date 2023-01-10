package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        EmpolyeeClass employee1 = new EmpolyeeClass("Uros",'M',28,1000.0);


        System.out.println(employee1);

        employee1.setAge(32);

        System.out.println(employee1);

        EmpolyeeClass empolyee2 = new EmpolyeeClass("Milos",'M',30,700);

        empolyee2.setSalary(empolyee2.getSalary()+200);

        System.out.println(employee1);
        System.out.println(empolyee2);








    }



}
