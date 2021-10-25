// Q1.Write a Java program to return true if a given string contain the string 'pop', but the middle 'o' also may other character.
package core;

public class Question1 {
   static boolean popInTheString(String stng)
    {
        int len = stng.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (stng.charAt(i) == 'p' && stng.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String str1 =  "dikchapop";
        System.out.println("The given string is: "+str1);
        System.out.println("Is p?p appear in the given string? "+popInTheString(str1));
    }
}
