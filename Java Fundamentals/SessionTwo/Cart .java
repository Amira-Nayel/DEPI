import java.util.*;
class Cart{
    public static void main(String[] args){
        //first we're using scanner to take inputs from user
         Scanner input = new Scanner (System.in);
        System.out.println("Product Name: ");
        String productName = input.nextLine();
        System.out.println("Category: ");
        char category = input.next().charAt(0);
        System.out.println("Price: ");
        double price = input.nextDouble();
        System.out.println("Quantity: ");
        int quantity = input.nextInt();
        boolean isAvailable ;
        if (quantity == 0) {
            isAvailable = false;
        } else {
            isAvailable = true;
        }
        //check if quantity is = zero then it's not available
        System.out.println("Product Named: " + productName );
        System.out.println("Category: " + category );
        System.out.println("Price: " + price );
        System.out.println("Quantity: " + quantity );
        System.out.println("is Available: " + isAvailable );
    }

}
