package FUNCTIONS;

public class shadowing {
    static int a = 100; // Class-level static variable (global within the class)

    public static void main(String args[]) {
        // Modifying the class-level 'a'
        a = 43; // This changes the original static variable 'a'
        System.out.println("Value of a in main: " + a); // Prints 43
        Calling();
    }

    static void Calling() {
        // The value of 'a' has been changed in main(), so it will print the modified value
        System.out.println("Value of a in Calling: " + a); // Prints 43
    }
}
