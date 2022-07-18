/* 14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.6 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
package homework6;

public class Question_14 {
    public static void main(String[] args) {

        float w = 5.6f;
        float h = 8.5f;
        float p1 = 5.6f;
        float p2 = 8.5f;

        System.out.println("Area is :" +(w*h));
        System.out.println("Perimeter is :" +(2*(p1+p2)));

    }

}
