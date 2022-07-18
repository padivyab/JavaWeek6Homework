/*2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print
statement. 2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme. */
package homework6;

public class Question_2 {

    static int a = 10; //declare variable
    static String str = "Div";

    public static void main(String[] args) {  // user denied method

        System.out.println(a); // called static variable direct static method
        System.out.println(str); // called static variable direct static method

    }

    static void s1() // declared static method
    {

        System.out.println(a); // called static variable using static method
        System.out.println(str); // called static variable using static method
    }
}
