package Homework2;

public class Excercise3 {
    public static void main(String args[]) {
        String myFirstString = "The quick brown fox jumps over the lazy dog.";
        String replaceStr = myFirstString.replaceAll("fox", "cat");
        System.out.println("New string: " + replaceStr);
    }
}
