import java.util.*;
class Calculator{
    public static void main(String[] args){
        //first we're using scanner to take inputs from user
        Scanner input = new Scanner (System.in);
        System.out.println("please enter the first number");
        double firstNumber = input.nextDouble();
        System.out.println("please enter the second number");
        double secondNumber = input.nextDouble();
        //print all operations on both numbers
        System.out.println("The Summation: " + (firstNumber + secondNumber) );
        System.out.println("The Subtraction: " + (firstNumber - secondNumber) );
        System.out.println("The Multiplication: " + (firstNumber * secondNumber) );
        System.out.println("The Division: " + (firstNumber / secondNumber) );
        System.out.println("The Reminder: " + (firstNumber % secondNumber) );


    }

}