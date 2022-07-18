/* 8. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C). */
package homework6;

public class Question_8 {
    //main method user defined method
    public static void main(String args[])
    {
        float f = 57; // declared local variable
        float celsius;
        celsius = ((f-32)*5/9); // formula
        System.out.println("Convert fahrenheit to celsius : " +celsius); // printing statement with variable

    }

}
