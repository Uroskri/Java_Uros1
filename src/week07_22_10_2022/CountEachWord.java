package week07_22_10_2022;

public class CountEachWord {
    public static void main(String[] args) {

        String names = "Adam Adam Barry Aysun Aysun";
String result="";

        String temp = "";

        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            if (ch != ' ') {
                temp += ch;
                continue;
            }

            String search = temp;
            int count = 0;
            String dumy = names;
            while (dumy.contains(search)){
                count++;
                dumy=dumy.replaceFirst(search,"");

            }
            if (!result.contains(search)){

            result+=search+"-"+count+" ";}
            temp="";


        }
        System.out.println(result);

    }
}
