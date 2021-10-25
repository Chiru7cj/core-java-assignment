package core;

import java.util.Scanner;

// WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal to its last character. For the required loop, use a
//while statement
//do-while statement
public class Question10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while(!word.equals("done"))
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }
    }
}
