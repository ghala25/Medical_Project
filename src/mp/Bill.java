package mp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author Rayda
 */

// this class uis an implement structure for the interface
public class Bill implements InterfaceBill  {
    
    /*we create 6 private feilds with diffrent type
      and initializing the final feild*/
    private double total ;
    private double totalpt;
    private final double perTax=0.15;
    private long card;
    private  String nameOfCard;
    private  String payType;
    
    // create a Scanner object to allow the user to answer the giving questions
    Scanner scan = new Scanner(System.in);
    
    // we toke 3 object related to 3 classes
    Person person = new Person();
    UniLevels uniLevels= new  UniLevels();
    GeneralCourse generalCourse=new GeneralCourse();
    
   
    
    /* its constracter and its have 4 object parameters which is a compositin relationship
        between this class and (person,uniLevels,generalCourse)
    the main reason to use this objects is: use the feilds and arrays that located in that classes */
    public Bill(Person person,UniLevels uniLevels,GeneralCourse generalCourse) {
        this.person = person;
        this.uniLevels=uniLevels;
        this.generalCourse=generalCourse;
        // we used "this" to avoid a shadwing process to store the values.
    }
    // defult constracter
    public Bill(){
    
    
    }
    
    /* this method helps to print the bill,first we initializing a double feild
    then we put a print statemnts to print the user's personal data
    and we use the (uniLevels object) we use for loop to print the services he choosed then 
    the total price for each service will be printed apart and
    the same thing will repeated with the (generalCourse) but by using for loop*/
    public void printBill(){
        double sum = 0.0;
        double total;
        
         paying( );
       
        System.out.println("--------------------------------------------------------- \n");
         System.out.println("name : "+person.getName());
        System.out.println("Id : "+person.getId());
        System.out.println("Mobile : "+person.getNumPhone());
        System.out.println("The data of your booking ");
       
        System.out.println("--------------------------------------------------------- \n");
        
              for(int i = 0;i<uniLevels.getArrayRequest().size();i++){
            int x =uniLevels.giveRequestItem(i);
            System.out.println(uniLevels+" - "+uniLevels.giveArrayPrice(x));
            sum += uniLevels.giveArrayPrice(x);
        }        
        for(int i = 0;i<generalCourse.getArrayRequest().size();i++){
            int x =generalCourse.giveRequestItem(i);
            System.out.println(generalCourse+" - "+generalCourse.giveArrayPrice(x));
            sum += generalCourse.giveArrayPrice(x);
        }
        
        // HERE WE CALLED THE METHODS FROM ITS CLASSES
      
        uniLevels.getSum();
        this.total=uniLevels.getSum();
        this.total = (uniLevels.getSum());
        System.out.println("--------------------------------------------------------- \n");
        System.out.println("the total before adding tax= "+this.total);
        System.out.print("the tax amount= " );
        System.out.println(total=this.total*perTax);
        System.out.print("the total after adding tax amount= ");
        System.out.println(totalpt=total+this.total );

        
    }
    // this method helps to saving the bill by FILENAME and we put the information that we want to save
    @Override
    public void saveBill(){
        double sum = 0.0;
        String fileName = "Bill.txt";
        PrintWriter outputStream = null;
        
        try{
            outputStream = new PrintWriter(fileName);
        
        
        outputStream.println("\n\n");
        outputStream.println("---------------------------------------------------------");
        outputStream.println(person.toString());
            outputStream.println(uniLevels);
            sum += uniLevels.giveArrayPrice(0);
        
        for(int i = 0;i<generalCourse.getArrayRequest().size();i++){
            int x = generalCourse.giveRequestItem(i);
            outputStream.println(generalCourse+" - "+generalCourse.giveArrayPrice(x));
            sum += generalCourse.giveArrayPrice(x);
        }
        
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening file "+fileName);
            System.exit(0);
        }
        outputStream.close();
        System.out.println("Receipt has been saved successfully");
    }
    
    // this method helps to pay
      public  void paying( ){
        // there is two print statements and "scan.next" to allow the user put the way he wants to pay with
        System.out.println("What the way do you prefer to paying? ");
        System.out.println("we have \n -cash \n -Cridet Card");
        payType=scan.nextLine();
        
        // we use if-statement to know what the way the user wants to pay with 
        // if the user want to pay by cash he will only put his personal data
        
        if(payType.equalsIgnoreCase("Cridet card")){

        System.out.println("plese enter your card name");
        nameOfCard=scan.nextLine();
        System.out.println("plese enter your card number");
        card = scan.nextLong();
        System.out.println("\n\n");
        System.out.println(" Ok that is your bill");
        System.out.println("--------------------------------------------------------- \n");
        System.out.println("credit data :\n Card Name:  "+nameOfCard +"\n Card Number: "+card);
        

        // else if user want to pay by credit card he will put his credit information and his personal data
        }
        else{
            System.out.println("\n\n");
            System.out.println(" Ok that is your bill");
        }
        

            }
      
// this is an overriding toString method ITS HELP US TO
    // PRINT any information we want of the class
    @Override
    public String toString() {
        return "Receipt{" + "total=" + total + ", totalpt=" + totalpt + ", perTax=" + perTax + ", person=" + person + ", uniLevels=" + uniLevels + ", generalCourse=" + generalCourse + ", card=" + card + ", nameOfCard=" + nameOfCard + ", payType=" + payType + '}';
    }



}
