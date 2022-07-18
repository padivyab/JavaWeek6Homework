/* 16. Write a Java program to add two binary numbers. */
package homework6;

public class Question_16 {
    // main method user defined method
    public static void main (String args[])
    {
        System.out.println("Input Data :"); // printing statement
        System.out.println("    Input first binary number  : 10");
        //Integer.toBinaryString(     10);
        System.out.println("    Input second binary number : 11"); // printing statement
        //Integer.toBinaryString(     11);
        System.out.println("Expected Output :");
        System.out.println("    Sum of two binary numbers :" +(Integer.toBinaryString(10)+Integer.toBinaryString(11))); // called predefined method

    }
}
