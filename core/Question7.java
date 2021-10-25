package core;
// Write a program to find the number of occurrences of a character in a string without using a loop

public class Question7 {
    // Method that return count of the given
    // character in the string
    public static int count(String s, char c)
    {
    int res = 0;

        for (int i=0; i<s.length(); i++)
    {
        // checking character in string
        if (s.charAt(i) == c)
            res++;
    }
        return res;
}

    // Driver method
    public static void main(String args[])
    {
        String str= "java kup assignment";
        char c = 'a';
        System.out.println(count(str, c));
    }
}
