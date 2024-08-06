import java.util.*;
class UserInfo{
    public static void main(String[] args){
        //first we're using scanner to take inputs from user
        Scanner input = new Scanner (System.in);
        System.out.println("Please answer the following questions! \n");
        System.out.println("What is your Faculty? ");
        String faculty = input.nextLine();
        System.out.println("What is your last grade? ");
        char grade = input.next().charAt(0);
        System.out.println("What is your last degree(CGPA) ? ");
        double degree = input.nextDouble();
        System.out.println("How many subject do your have you studied ? ");
        int subjects = input.nextInt();
        System.out.println("Have you succeeded? (true/ false)");
        boolean isSucceeded = input.nextBoolean();

        //to print user's data
        System.out.println("\n So it's "+ isSucceeded + " that you have succeeded this year studying "+ subjects +" subjects at your faculty of " + faculty + " with grade " + grade + " and degree of " + degree);

    }

}
