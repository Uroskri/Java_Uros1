package day26_CustomMethodPractice;

public class FrequencyOfElement {

    public static int frequencyOfElement(int [] arr,int element){

        int count = 0;

        for (int each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(double [] arr,double element){

        int count = 0;

        for (double each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(char [] arr,char element){

        int count = 0;

        for (char each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(String [] arr,String element){

        int count = 0;

        for (String each : arr) {
            if (each.equals(element)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int [] arr = {1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3};

        int n = frequencyOfElement(arr,1);
        System.out.println("n = " + n);







    }
}
