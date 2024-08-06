import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        double firstNumber = input.nextDouble();
        System.out.println("please enter the second number");
        double secondNumber = input.nextDouble();
        //check if user input an integer or double
        boolean firstN_isInteger = (firstNumber ==(int)firstNumber);
        boolean secondN_isInteger = (secondNumber ==(int)secondNumber);
        // let user choose an operation
        System.out.println("please enter the operator (+ , - , / , * , % )");
        char operator = input.next().charAt(0);
        switch (operator){
            case '+' :
                if(firstN_isInteger && secondN_isInteger){
                    sum((int)firstNumber , (int)secondNumber);
                }else {sum(firstNumber , secondNumber);}
                break;
            case '-' :
                if(firstN_isInteger && secondN_isInteger){
                    subtraction((int)firstNumber , (int)secondNumber);
                }else {subtraction(firstNumber , secondNumber);}
                break;
            case '*' :
                if(firstN_isInteger && secondN_isInteger){
                    multiplication((int)firstNumber , (int)secondNumber);
                }else {multiplication(firstNumber , secondNumber);}
                break;
            case '/' :
        if(firstN_isInteger && secondN_isInteger){
                    division((int)firstNumber , (int)secondNumber);
                }else {division(firstNumber , secondNumber);}
                break;
            case '%' :
                if(firstN_isInteger && secondN_isInteger){
                    reminder((int)firstNumber , (int)secondNumber);
                }else {reminder(firstNumber , secondNumber);}
                break;
            default :
             System.out.println("wrong input! ");
        }
    }
    public static void sum(int x, int y){System.out.println("The Summation is: " + (x + y) );}
    public static void sum(double x, double y){System.out.println("The Summation is: " + (x + y) );}
    public static void subtraction(int x, int y){System.out.println("The Subtraction is: " + (x - y) );}
    public static void subtraction(double x, double y){System.out.println("The Subtraction is: " + (x - y) );}
    public static void multiplication(int x, int y){System.out.println("The Multiplication is: " + (x * y) );}
    public static void multiplication(double x, double y){System.out.println("The Multiplication is: " + (x * y) );}
    public static void division(int x, int y){
        if(y==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Division is: " + (x / y) );
    }
    public static void division(double x, double y){
         if(y==0)System.out.println("Error! division by zero is not allowed.");
        else System.out.println("The Division is: " + (x / y) );
    }
    public static void reminder(int x, int y){System.out.println("The Reminder is: " + (x + y) );}
    public static void reminder(double x, double y){System.out.println("The Reminder is: " + (x + y) );}
}