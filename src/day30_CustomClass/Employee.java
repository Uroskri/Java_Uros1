package day30_CustomClass;

public class Employee {
    public String name;
    public int ID;
    public int age;
    public char gender;
    public String jobTitle;
    public double sallary;
    public boolean isFullTime;

    public void setInfo(String name, int ID, int age, char gender, String jobTitle, double sallary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.sallary = sallary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", sallary=" + sallary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
}
