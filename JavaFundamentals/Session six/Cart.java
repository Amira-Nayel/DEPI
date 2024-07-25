import java.util.*;
class Cart{
    public static void main(String[] args){
        
        Storage s1 = new Storage("S08","Western Digital SSD","Storage",3399,20, " Exterior", 512 );
        Monitors obj_3 = new Monitors("M22","Samsung smart TV","Monitors",15999,4,"UDH","55 Inches");
        s1.getStorageDetails();
        System.out.println();
        obj_3.getMonitorDetails();
        System.out.println();

    //add a customer
        Customer c1 = new Customer("Ahmed Magdy", "Alexandra, PourSaaid", 2012445588);
        c1.reCharge_CustomerBalance(50000);
        c1.checkOut(obj_3.sellProduct(2));
    //restock second product
        System.out.println();
        obj_3.getProductStock();
        System.out.println();
        obj_3.reStock(5);

    }
}


class Product{
     String productName,productID,category;
     double price;
     int stock;
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

class Monitors extends Product{
    private String resolution, screenSize;
    private static int counter=0;
    
    //constructors
    Monitors(){counter++;}
    Monitors(String productID,String productName, String category, double price, int stock, String resolution, String screenSize){
        super(productID,productName,category,price,stock);
        counter++;
        this.resolution=resolution;
        this.screenSize=screenSize;
       
    }

    //methods 
    public void getMonitorResolution(){
        System.out.println("Resolution: " + resolution );
    }
    public void getMonitorScreenSize(){
        System.out.println("Screen Size: " + screenSize );
    }  

    public void setMonitorDetails(String productID, String productName, String category, double price, int stock, String resolution,String screenSize){
        super.setProductDetails(productID,productName,category,price,stock);
        this.resolution=resolution;
        this.screenSize=screenSize;
    }
    public void getMonitorDetails(){
        super.getProductDetails();
        if(super.stock == 0){

            System.out.println("Resolution: " + this.resolution );
            System.out.println("Screen Size: " + this.screenSize );

        }else{

             System.out.println("Resolution: " + this.resolution );
            System.out.println("Screen Size: " + this.screenSize );
        }
    }
            
    public void getMonitorsNumber (){
        System.out.println("Number of Monitors : "+ counter);
    }
}

class Storage extends Product{
    private int capacity_GB;
    private String type;
    private static int counter=0;
    
    //constructors
    Storage(){counter++;}
    Storage(String productID,String productName, String category, double price, int stock,String type, int capacity_GB){
        super(productID,productName,category,price,stock);
        counter++;
        this.type=type;
        this.capacity_GB=capacity_GB; 
    }

    //methods 
    public void getStorageType(){
        System.out.println("Type: " + type );
    }
    public void getStorageInGB(){
        System.out.println("Capacity: " + capacity_GB +"GB");
    }  

    public void setStorageDetails(String productID, String productName, String category, double price, int stock,String type, int capacity_GB){
        super.setProductDetails(productID,productName,category,price,stock);
        this.type=type;
        this.capacity_GB=capacity_GB;
    }
    public void getStorageDetails(){
        super.getProductDetails();
        if(super.stock == 0){
            System.out.println("Type: " + type );
            System.out.println("Capacity: " + capacity_GB +"GB");

        }else{
            System.out.println("Type: " + type );
            System.out.println("Capacity: " + capacity_GB +"GB");
        }
    }
            
    public void getStorageNumber (){
        System.out.println("Number of Storage items : "+ counter);
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

