/* 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

Binary number is: 101 */
package homework6;

public class Question_18 {
    public static void main(String[] args) {

        int a = 125;
        int b = 24;
        System.out.println("Expected Output:");
        System.out.println("125 + 24 = " +(a+b));
        System.out.println("125 - 24 = " +(a-b));
        System.out.println("125 X 24 = " +(a*b));
        System.out.println("125 / 24 = " +(a/b));
        System.out.println("125 mod 24 = " +(a%b));

    }


}
