/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C). */
package homework6;

public class Question_7 {
    public static void main(String[] args) {
        float Fahrenheit = 43;
        float Celsius;
        Celsius =((Fahrenheit-32)*5)/9;
        System.out.println("Convert fahrenheit to celsius : " +Celsius);

    }
}
