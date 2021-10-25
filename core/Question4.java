package core;
// Write a Java Program to reverse a string without using String inbuilt function.
public class Question4 {
    public static void main(String[] args) {

        String str = "Hello world";
        String revString = "";

        for (int i = str.length() - 1; i >= 0; --i) {
            revString += str.charAt(i);
        }

        System.out.println(revString);
    }
}
