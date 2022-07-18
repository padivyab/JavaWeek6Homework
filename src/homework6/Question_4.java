/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme. */
package homework6;

public class Question_4 {

    int a = 10; // declared instance variable
    String str = "Divya";
    static int a1 = 20;
    static String str1 = "Shiv";

    public static void main(String[] args) {

        // main method user defined method
        Question_4 q4=new Question_4(); // create an object
        q4.m1(); // called instance method
        System.out.println(q4.a); // called instance variable using object
        System.out.println(q4.str);
        System.out.println(a1);
        System.out.println(str1);

    }
    void m1()
    {
        System.out.println(a); // called instance variable using instance method (not create object)
        System.out.println(str); // called static variable using instance method
        System.out.println(a1);
        System.out.println(str1); // called static variable using instance method

    }
    static void s1()
    {
        Question_4 q4=new Question_4(); // create an object
        System.out.println(q4.a); // called instance variable using object
        System.out.println(a1);
        System.out.println(q4.str); // called static variable using object
        System.out.println(str1); // // called static variable using static method
    }
}
