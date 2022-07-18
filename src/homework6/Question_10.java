/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */
package homework6;
//import scanner package
import java.util.Scanner;

public class Question_10 {
    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //declared scanner class
        System.out.println("Input a Number :"); //print statement
        int num=sc.nextInt();
        System.out.println("Expected Output :");
        int i;////reading a number whose table is to be print
        for(i=1;i<=10;i++)  ////loop start execution form and execute until the condition i<=10 becomes false
        {
            System.out.println(num+"X"+i+"="+num*i); // printing statement with logic
        }

    }

}
