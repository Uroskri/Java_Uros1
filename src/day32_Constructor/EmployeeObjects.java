package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Uros");


        System.out.println(employee1);

        Employee employee2 = new Employee("Milos",'M');

        System.out.println(employee2);


        Employee employee3 = new Employee("Olga",'F',"SDET");

        System.out.println(employee3);

        Employee employee4 = new Employee("Milena",'F',"Cus.Serv.",130000);

        System.out.println(employee4);










    }
}
