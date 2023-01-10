package week07_22_10_2022;

public class ChanginfWord {
    public static void main(String[] args) {

        String cat = "I love my cats. My cat name is Coco.My cat is very smart.";
        String searched = "cat";
        String changed = "dog";

        String result = "";
while (cat.contains(searched)) {
    int indexOfFirstCat = cat.indexOf(searched);
    int endOfWord = indexOfFirstCat + searched.length();


    cat = cat.substring(0, indexOfFirstCat) + changed + cat.substring(endOfWord);

}
        System.out.println(cat);







    }
}
