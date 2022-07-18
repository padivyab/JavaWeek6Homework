/* 3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables i
        nto both instance and static methods inside the print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme. */
package homework6;

public class Question_3 {

    String str = "Divya"; // Declared Instance variable
    static int a1 = 10; // Declared static variable

    public static void main(String[] args) {

        Question_3 q3 =new Question_3();
        q3.p1();
        System.out.println(q3.str); // called instance variable using static method (needs to create object)
        //System.out.println(p1);
        System.out.println(a1); // called static variable using static method (no need to create object)
        
    }
    void p1() //Instance method
    {
        Question_3 q3 =new Question_3(); // Create Object inside the Instance method
        System.out.println(q3.str);
        System.out.println(a1);


    }
    static void s1() // Static method
    {
        System.out.println(a1); // called static variable direct
        Question_3 que=new Question_3(); // Create object
        System.out.println(que.str); // Called instance variable using object
    }

}
