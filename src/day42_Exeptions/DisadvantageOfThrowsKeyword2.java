package day42_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {


        public static void method1() throws FileNotFoundException{

            new FileInputStream("");


        }


        public static void method2() throws FileNotFoundException{
            method1();
        }








}
