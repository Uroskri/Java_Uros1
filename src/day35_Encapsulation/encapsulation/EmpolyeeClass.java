package day35_Encapsulation.encapsulation;

public class EmpolyeeClass {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
           return;
        }
        this.name=name;
    }

    private char gender;
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if (!(gender=='M'||gender=='F')){
           return;
        }
        this.gender=gender;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<=16||age>90){
           return;
        }
        this.age=age;
    }

    private double salary;
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if (salary<=0){
            return;
        }
        this.salary=salary;
    }


    public EmpolyeeClass(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }


    public String toString() {
        return "EmpolyeeClass{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
