/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */
package homework6;

public class Question_5 {

    //main method
    public static void main(String[] args) {

        Question_5 q5=new Question_5(); // Create an Object
        q5.addition(10,20); // Called static method direct for addition.
        q5.subtraction(20,10); // Called static method direct for subtraction.
        //q5.multiplication(10,20);
        //q5.division(20,10);
        q5.multiplication(20,20); // Called void method using object for multiplication
        q5.division(20,10); // Called void method using object for multiplication

    }
    public static int addition(int a,int b)
    {
        int result =(a+b);
        System.out.println("Addition :" +(result));
        return result;
    }
    public static int subtraction(int a,int b)
    {
        int result1 = (a-b);
        System.out.println("Subtraction :" +(a-b));
        return result1;
    }
   /* public static int multiplication(int a,int b)
    {

        int result2 = (a*b);
        System.out.println("Multiplication :" +(a*b));
        return result2;

    }
    public int division(int a,int b)
    {
        int result3 = (a/b);
        System.out.println("Division :" +(a/b));
        return result3;
    } */
    public void multiplication(int a, int b)
    {
        System.out.println("Multiplication :" +(a*b));
    }
    void division(int a,int b)
    {
        System.out.println("Division :" +(a/b));
    }
}
