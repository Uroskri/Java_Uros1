package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //not possible to use the private Data from A.M. class


        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3(); not possible due to private access modifier












    }



}
