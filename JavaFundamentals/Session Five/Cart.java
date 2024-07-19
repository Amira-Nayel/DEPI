import java.util.*;
class Cart{
    public static void main(String[] args){
        
        Product obj_1 = new Product("M22","Samsung UHD smart TV","Monitors",15999,4);
        Product obj_2 = new Product("S08","Western Digital 1TB SSD","Storage",3399,20);
        Product obj_3 = new Product("L35","Dell Vostro 15-3010 core-i5","Pc & Laptops",24999,2);
        obj_1.getProductDetails();
        System.out.println();
        obj_2.getProductDetails();
        System.out.println();
        obj_3.getProductDetails();
        System.out.println();
        //add a customer
        Customer c1 = new Customer("Ahmed Magdy", "Alexandra, PourSaaid", 2012445588);
        c1.reCharge_CustomerBalance(10000);
        c1.checkOut(obj_2.sellProduct(2));
        //restock second product
        System.out.println();
        obj_2.getProductStock();
        System.out.println();
        obj_2.reStock(5);

    }//main method
}


class Product{
    private String productName,productID;
    private String category;
    private double price;
    private int stock;
    private static int counter=0;
    
    //constructors
    Product(){counter++;}
    Product(String productID,String productName, String category, double price, int stock){
        counter++;
        this.productID=productID;
        this.productName=productName;
        this.category= category;
        this.price=price;
        this.stock = stock;
    }

    //methods 
    public void reStock(int quantity){
        this.stock+=quantity;
        System.out.println(this.productName +" is restocked. the new quantity in stock is: "+ stock);
    }
    public void updatePrice(int newPrice){
        this.price= newPrice;
    }
    public void getProductPrice(){
        System.out.println("Price: " + price +" LE");
    }
    public void getProductStock(){
        if(stock == 0){
            System.out.println(this.productName+" Is OUT OF STOCK!");
        }else{System.out.println("Quantity in stock: " + stock );  
        }
    }  
    public void getProductName(){
        System.out.println("Product Named: " + productName );
    }
    public void getProductCategory(){       
        System.out.println("Category: " + category );
    }  
    public void setProductDetails(String productID, String productName, String category, double price, int stock){
        this.productID=productID;
        this.productName=productName;
        this.category= category;
        this.price=price;
        this.stock = stock;
    }
    public void getProductDetails(){
        if(stock == 0){
            System.out.println("Product ID: " + productID );
            System.out.println("Product Named: " + productName );
            System.out.println("Category: " + category );
            System.out.println("Price: " + price +" LE");
            System.out.println("OUT OF STOCK!");
        }else{
            System.out.println("Product ID: " + productID );
            System.out.println("Product Named: " + productName );
            System.out.println("Category: " + category );
            System.out.println("Price: " + price +" LE");
            System.out.println("Quantity in stock: " + stock );
        }
            

    }
    public double sellProduct(int quantity){
        this.stock-= quantity;
        System.out.println("\nOrder details: " );
        System.out.println(quantity +"  "+ productName );
        return (quantity*this.price);
    }
    public void getProductsNumber (){
        System.out.println("Number of Products : "+ counter);
    }
}

class Customer{
    private String name,address;
    private long phoneNumber;
    private double balance;
    private static int numbOfCustomers;

    //constructors
    Customer(){
        numbOfCustomers++;
        System.out.println("New customer visited");
        }
    Customer(String name, String address,long phoneNumber ){
        numbOfCustomers++;
        this.name= name;
        this.address= address;
        this.phoneNumber= phoneNumber;
        this.balance= 0;
        System.out.println("New customer Registered");
        }
    //methods        
    //setters
    public void setCustomerName (String name){this.name=name;}
    public void setCustomerAddress (String address){this.address=address;}
    public void setCustomerPhoneNumber (long phoneNumber){this.phoneNumber=phoneNumber;}
    public void reCharge_CustomerBalance (double newBalance){
    this.balance += newBalance;
    System.out.println("Balance recharged Successfully. New Balance is "+ this.balance+"LE");}
    public void setCustomerDetails (String name, String address,long phoneNumber, double balance){
    this.name=name;
    this.address=address;
    this.phoneNumber=phoneNumber;
    this.balance=balance;
    }
    public void checkOut (double price){
    this.balance -= price;
    System.out.println("The order Total is "+price+"LE, the Reminder balance is: "+ balance+"LE");
    }
    //getters
    public void getCustomerName (){System.out.println("Customer Name: "+ name);}
    public void getCustomerAddress (){System.out.println("Customer Address : "+ address);}
    public void getCustomerPhoneNumber (){System.out.println("Customer Phone Number : "+ phoneNumber);}
    public void getCustomerBalance (){System.out.println("Customer Balance : "+ balance);}
    public void CustomerDetails (){
        System.out.println("Customer Name is "+ name);
        System.out.println("Address : "+ address);
        System.out.println("Phone Number : "+ phoneNumber);
        System.out.println("Balance : "+ balance);
    }
    public void getCustomersNumber (){
    System.out.println("Number of Customers : "+ numbOfCustomers);
    }
}

