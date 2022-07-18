/* 13. Write a Java program that takes three numbers as input to calculate and
        print the average of the numbers. */
package homework6;
// import scanner package
import java.util.Scanner;

public class Question_13 {
    //main method (user defined method)
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); // take input from user using scanner class
        System.out.println("Enter the first number : ");
        double a = sc.nextInt(); // scanner method
        System.out.println("Enter the second number : ");
        double b =sc.nextInt();
        System.out.println("Enter the third number : ");
        double c = sc.nextInt();
        double avg; // declared local variable
        avg=a+b+c/3; // avg formula
        System.out.println("The average is : " +avg); // printing statement

    }
}
