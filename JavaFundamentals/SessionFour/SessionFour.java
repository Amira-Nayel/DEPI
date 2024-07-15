import java.util.*;
public class SessionFour {    
    public static void main(String[] args){
//take 2 arrays from user and concatenate them
        System.out.print("Enter the number of elements of the First list : ");
        int n1 =new Scanner(System.in).nextInt();
        int[] a1 = new int[n1];
        //fill the first array
        for(int i=0; i<a1.length ; i++){
            System.out.print("Enter element number " + (i+1) + " : ");
            a1[i]=new Scanner(System.in).nextInt();
        }
        System.out.print("Enter the number of elements of the Second list : ");
        int n2 =new Scanner(System.in).nextInt();
        int[] a2 = new int[n2];
        //fill the Second array
        for(int i=0; i<a2.length ; i++){
            System.out.print("Enter element number " + (i+1) + " : ");
            a2[i] =new Scanner(System.in).nextInt();
        }
        //concatenate in new array
        int[] resultArray =new int[n1+n2];
        for(int i=0; i< a1.length ; i++)resultArray[i]=a1[i];
        for(int i=(n1); i< (n1+n2) ; i++)resultArray[i]=a2[i-n1];
        //print the resulted array
        System.out.println("The resulted List: ");
        for(int i=0; i<(n1+n2) ; i++)System.out.print(resultArray[i]+ " ");

//take string from user and divided it by spaces in it
        System.out.println("\nEnter a sentence: ");
        String sentence =new Scanner(System.in).nextLine();
        String[] words =sentence.split(" ");
        //print the resulted array
        System.out.println("The words are: ");
        for(int i=0; i<words.length ; i++)System.out.println(words[i]);
    }
}