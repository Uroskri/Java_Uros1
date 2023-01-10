package day33_Statics;

public class CydeoStudents {


    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOdStudy;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;


    static {
        schoolName="CYDEO";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";

    }


    public static void printSchoolName(){
        System.out.println("School is "+schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is "+programmingLanguage);
    }
    public static void printSecretCode(){
        System.out.println("code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+ " is attending class");
    }
    public void study(){
        System.out.println(name+" is studying");
    }


    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOdStudy='" + fieldOdStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }

}
