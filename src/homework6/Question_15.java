/* 15. Write a Java program to swap two variables. */
package homework6;

public class Question_15 {
    //main method
    public static void main(String[] args) {

        int x = 10; // declare local variable
        int y = 20;
        int z;
        System.out.println("Before swapping : " +x+" "+y); // before swapping
        z=x; /* swapping */
        x=y;
        y=z;
        System.out.println("After Swapping : " +x+" "+y); // after swapping



    }
}
