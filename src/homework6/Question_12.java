/* 12. Write a Java program to compute the specified expressions and print the
        output.
        Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output : 2.138888888888889 */
package homework6;

public class Question_12 {

    // main method user defined method
    public static void main(String[] args) {

        double a = 25.5d; // declared local variable
        float b = 3.5f;
        double c = 40.5d;
        float d = 4.5f;
        //System.out.println("Test Data : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.println("Expected Result : " +((a*b-b*b)/(c-d))); // printing statement with formula
    }



}
