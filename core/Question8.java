package core;
// Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively
public class Question8 {
    //static variable
    static  int age =22;
    //static function
    static void getLastname() {
        System.out.println("Kumar");
    }
    //static block
   static  {
        System.out.println("Chiranjeev");
    }

    public static void main(String[] args) {
        getLastname();
        System.out.println(age);
    }
}
