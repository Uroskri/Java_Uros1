package week06_10_15_2022;

public class Milena {
    public static void main(String[] args) {

        String str = "8341!#@**($#H348234898472*#&@^#$#$@)a$&#*$&37128321237" +
                "a823173821326733728127#^$&$)__ t1723871283718273i6334 61431" +
                "%$#%!*&#(*#*@&36276376273627&@%^7123637123";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch==' ')){

                result+=ch;
            }
        }
        System.out.println(result);


    }
}
