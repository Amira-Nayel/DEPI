import java.util.Scanner;
class SessionThree{
    public static void main(String[] args){
    //Print from 1 to 10: 
        System.out.println("\n1) Print from 1 to 10: ");
        for(int i =1 ; i<=10; i++){System.out.print(i + ", ");}
        
    //Print from 10 to users num:
        System.out.print("\n\n2) Print from 10 to: ");
        int x = new Scanner(System.in).nextInt();
        for(int i =10 ; i<=x; i++){System.out.print(i + ", ");}
        
    //sum of first 10 natural numbers
        int sum =0;
        for(int i =1 ; i<=10; i++){sum+=i;}
        System.out.println("\n\n3) The Sum of the first 10 natural numbers equals: "+ sum);
        
    //numb raised to the power of the other:
        System.out.print("\n4) Raise the number: ");
        int numb = new Scanner(System.in).nextInt();
        System.out.print("To the power of: ");
        int numb2 = new Scanner(System.in).nextInt();
        int result=1;
        for(int i =1 ; i<=numb2; i++){result=numb*numb;}
        System.out.println("Result: "+ result);
       
    //Factorial:
        System.out.print("\n5) Calculate the Factorial of the number: ");
        int number = new Scanner(System.in).nextInt();
        int factorial =1;
        for(int i =number ; i>1; i--){factorial*=i;}
        System.out.println("the result is "+ factorial);
        
    //multiplication table from 3 to 20
        System.out.println("\n6) The multiplication table of 3 to 20");
        for(int i =0 ; i<=20; i++){System.out.println("3 *" + i+" = "+ (i*3));}

        }   
}
