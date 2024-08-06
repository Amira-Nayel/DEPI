import java.util.*;
import java.time.LocalDate;

class HospitalManagementSystem{
    public static void main(String[] args){
       Patient patient_1 = new Patient("Ahmed","ALEX",12045522,44,true, true,"vitamins", "B+", 15, 5, 2024);
       patient_1.getPatientDetails();
       System.out.println("\n");

       Employee n_1 = new Nurse("N133","Amal Gaber","Sidi Gaber",12045532,33,7, 3500, "Burn unit","Night",4);
       Employee n_2 = new Nurse("N324","Nevin Nagy","Ibrahemia",12044782,24,2, 2100, "Emergency", "Morning",1);
       Employee n_3 = new Nurse("N440","Rofyda Refaat","Hadaraa",11565522,40,11, 3900, "Intensive Care Unit", "Night", 2);
       Employee d_1 = new Doctor("D7","Mohamed El-Labany","Sporting",159945572,47,19,10750,"Surgery/ OR","Heart Surgery");

       Employee[] staff={n_1, n_2, n_3, d_1};
       for(Employee x :staff){
        x.getEmployeeID();
        x.getEmployeeSalary();
        x.riseSalary(0.1);
        System.out.print("After rise ");
        x.getEmployeeSalary();
        x.giveBonus(1200);
        System.out.println();
       }

    }
}

class Person{
    private String name,address;
    private long phoneNumber;
    private int age;


    //constructor
    Person(String name, String address,long phoneNumber, int age) {
        this.name= name;
        this.age=age;
        this.address= address;
        this.phoneNumber= phoneNumber;
        }
    //methods        
    //setters
    public void setPersonName (String name){this.name=name;}
    public void setPersonAge (int age){this.age=age;}
    public void setPersonAddress (String address){this.address=address;}
    public void setPersonPhoneNumber (long phoneNumber){this.phoneNumber=phoneNumber;}
    
    public void setPersonDetails (String name, String address,long phoneNumber, int age){
        this.name=name;
        this.age=age;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    //getters
    public void getPersonName (){System.out.println("Name: "+ name);}
    public void getPersonAge (){System.out.println("Age: "+ age);}
    public void getPersonAddress (){System.out.println( "Address : "+ address);}
    public void getPersonPhoneNumber (){System.out.println( "Phone Number : "+ phoneNumber);}

    public void PersonDetails (){
        System.out.println( "Name is "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address : "+ address);
        System.out.println("Phone Number : "+ phoneNumber);
    }

}

class Patient extends Person{
    private boolean medicalHistory,allergies;
    private String medications, bloodType;
    private LocalDate admissionDate, dischargeDate;
    private static int counter;
   //constructor
    Patient(String name, String address,long phoneNumber, int age){
        super(name, address,phoneNumber, age);
        counter++;
    }
    Patient(String name, String address,long phoneNumber, int age, boolean medicalHistory, boolean allergies, String medications ,String bloodType, int day, int month, int year) {
        super(name, address,phoneNumber, age);
        counter++;
        this.medicalHistory=medicalHistory;
        this.allergies=allergies;
        this.bloodType=bloodType;
        this.medications=medications;
        this.admissionDate = LocalDate.of(year, month, day);
    }
    //setters
    public void setPatientMedicalHistory (boolean medicalHistory){this.medicalHistory=medicalHistory;}
    public void setPatientAllergies (boolean allergies){this.allergies=allergies;}
    public void setPatientMedications (String medications){this.medications=medications;}
    public void setPatientBloodType (String bloodType){this.bloodType=bloodType;}
    public void setPatientAdmissionDate (int day, int month, int year){
        this.admissionDate = LocalDate.of(year, month, day);
        }
    public void setPatientDischargeDate (int day, int month, int year){
        this.dischargeDate = LocalDate.of(year, month, day);
     }
    
    public void setPatientDetails(String name, String address,long phoneNumber, int age,boolean medicalHistory,boolean allergies,String medications ,String bloodType, int day, int month, int year){
        super.setPersonDetails(name, address,phoneNumber, age);
        this.medicalHistory=medicalHistory;
        this.allergies=allergies;
        this.bloodType=bloodType;
        this.medications=medications;
        this.admissionDate = LocalDate.of(year, month, day);
    }    
    //getters
    public void getPatientMedicalHistory () {System.out.println("Medical History: "+ medicalHistory); }
    public void getPatientAllergies () {System.out.println("Allergies: "+ allergies); }
    public void getPatientMedications () {System.out.println( "Medications : "+ medications); }
    public void getPatientBloodType () {System.out.println( "Blood Type : "+ bloodType); }
    public void getPatientDischargeDate () {System.out.println( "Discharge Date : "+ dischargeDate); }
    public void getPatientAdmissionDate () {System.out.println( "Admission Date : "+ admissionDate); }

    public void getPatientDetails (){
        super.PersonDetails();
        System.out.println( "Medical History: "+ medicalHistory);
        System.out.println( "Allergies: "+ allergies);
        System.out.println( "Medications : "+ medications);
        System.out.println( "Blood Type : "+ bloodType);
        System.out.println( "Admission Date : "+ admissionDate);
        System.out.println( "Discharge Date : "+ dischargeDate);

    }
    public void getPatientsNumb (){System.out.println( "The total number of Patients is: "+ counter);}
}

class Employee extends Person{
    private String id,department;
    private int yearsOfExp;
    private long salary;
    private static int counter;

    //constructor
    Employee(String name, String address,long phoneNumber, int age){
        super(name, address,phoneNumber, age);
        counter++;
    }    
    Employee(String id, String name, String address,long phoneNumber , int age ,int yearsOfExp, long salary, String department){
        super(name, address, phoneNumber,age);
        counter++;
        this.id= id;
        this.salary= salary;
        this.department=department;
        this.yearsOfExp= yearsOfExp;
    }        
    //setters

    public void setEmployeeID (String id){this.id= id;}
    public void setEmployeeSalary (long salary){this.salary= salary;}
    public void setEmployeeDepartment (String department){this.department=department;}
    public void setEmployeeYearsOfExp (int yearsOfExp){this.yearsOfExp= yearsOfExp;}    
    public void setEmployeeDetails(String id, String name, String address,long phoneNumber ,int age,int yearsOfExp, long salary, String department){
        super.setPersonDetails(name, address,phoneNumber, age);
        this.id= id;
        this.salary= salary;
        this.department=department;
        this.yearsOfExp= yearsOfExp;
    }    
    //getters
    public void getEmployeeID (){System.out.println( "Employee ID : "+ id);}
    public void getEmployeeSalary (){System.out.println( "Salary : "+ salary);}
    public void getEmployeeDepartment (){System.out.println( "Department : "+ department);}
    public void getEmployeeYearsOfExp (){System.out.println( "Years Of Experience : "+ yearsOfExp);}  
    public void getEmployeeDetails (){
        super.PersonDetails();
        System.out.println( "Employee ID : "+ id);
        System.out.println( "Salary : "+ salary);
        System.out.println( "Department : "+ department);
        System.out.println( "Years Of Experience : "+ yearsOfExp);
    }
    public void getEmployeesNumb (){System.out.println( "The total number of Employees is: "+ counter);}
    //methods
    public void riseSalary (double rise){
        salary += salary * rise;
    }
    public double giveBonus (double bonus){
        System.out.println( "bonus added : "+ bonus);
        System.out.println( "Total Financial dues : "+ (bonus + this.salary));
        return (bonus + this.salary);
    }
}

class Nurse extends Employee{
    private String shift;
    private int floor;
    private static int counter;

    //constructors
    Nurse(String id, String name, String address,long phoneNumber,int age ,int yearsOfExp,long salary, String department){
        super(id,name, address, phoneNumber,age,yearsOfExp,salary,department);
    }    
    Nurse(String id, String name, String address,long phoneNumber,int age ,int yearsOfExp,long salary, String department,String shift ,int floor){
        super(id,name, address, phoneNumber,age,yearsOfExp,salary,department);
        this.floor= floor;
        this.shift= shift;
    }
    //methods        
    //setters
    public void setNurseFloor (int floor){this.floor=floor;}
    public void setNurseShift (String shift){this.shift=shift;}
    public void setNurseDetails(String id, String name, String address,long phoneNumber,int age ,int yearsOfExp,long salary, String department,String shift ,int floor){
        super.setEmployeeDetails(id,name,address,phoneNumber,age,yearsOfExp,salary, department);
        this.floor=floor;
        this.shift=shift;
    } 
    //getters
    public void getNurseFloor (){System.out.println( "Floor : "+ floor);}
    public void getNurseShift (){System.out.println( "Shift : "+ shift);}
    public void getNurseDetails (){
        super.getEmployeeDetails();
        System.out.println( "Floor : "+ floor);
        System.out.println( "Shift : "+ shift);
    }
    public void getNursesNumb (){System.out.println( "The total number of Nurses is: "+ counter);}
}

class Doctor extends Employee{

    private String specialization;
    private static int counter;

    //constructor
    Doctor(String id, String name, String address,long phoneNumber,int age ,int yearsOfExp,long salary, String department){
        super(id,name, address, phoneNumber, age,yearsOfExp,salary,department);
    }    
    Doctor(String id, String name, String address,long phoneNumber ,int age ,int yearsOfExp,long salary, String department,String specialization){
        super(id,name, address, phoneNumber, age,yearsOfExp,salary,department);
        this.specialization= specialization;
    }
    //methods        
    //setters
    public void setDoctorSpecialization (String specialization){this.specialization=specialization;}
    public void setDoctorDetails(String id, String name, String address,long phoneNumber ,int age ,int yearsOfExp,long salary, String department,String specialization){
        super.setEmployeeDetails(id,name,address,phoneNumber,age,yearsOfExp,salary, department);
        this.specialization=specialization;
    } 
    //getters
    public void getDoctorSpecialization (){System.out.println( "Specialization : "+ specialization);}
    public void getDoctorDetails (){
        super.getEmployeeDetails();
        System.out.println( "Specialization : "+ specialization);
    }
    public void getDoctorsNumb (){System.out.println( "The total number of Doctors is: "+ counter);}

}
