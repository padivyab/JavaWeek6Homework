/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print
statement. 1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme. */

package homework6;

public class Question_1 {

    int a = 10; // Instance Variable
    String str = "Divya";

    // Main method
    public static void main(String[] args) {

        Question_1 q =new Question_1(); // Create a Object
        q.p1(); //called instance method using object

    }
    void p1() // Instance Method
    {
        System.out.println(a); // Instance method call instance variable
        System.out.println(str); // Instance method call instance variable

    }
}
