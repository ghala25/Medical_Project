package mp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Rayda
 */

/**
 * This class represents a person and contains his/her personal information such as name,ID,
 * and phone number. It provides methods to set and retrieve the person's information.
 */
public class Person {
 
    //CREATE THREE PRIVATE AND DIFFRENT TYPE FEIDS
    private String Name;
    private long Id;
    private long NumPhone;
    
   // create a Scanner object to allow the user to enter his/her personal information
    Scanner scan= new Scanner(System.in);
   //CONSTACTER HAS 3 PARAMETER
     public Person(String Name, int uniLevels, long Id, long NumPhone) {
        this.Name=Name;
  
        this.Id=Id;
        this.NumPhone=NumPhone;
    }

     //defult costracter
    public Person() {
         
    }
     
     // Getter And Setter Methods
    public String getName() {
        return Name;
    }

   

    public long getNumPhone() {
        return NumPhone;
    }


    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }
    /* in this set method we use catch/try block to solve or catching the phone number exception
        like: when the user try to enters numbers less or greater than 10, we will catch it 
        and send this print statement. also the while loop an if-statement helps us for this proces*/
    public void setNumPhone(long NumPhone) {
         while (true){
            try{
             System.out.println("pleas enter your Phone number consiting of 10 digits");
             NumPhone = scan.nextLong();
             if(NumPhone < 500000000 || NumPhone > 599999999)
                 throw new Exception ("wrong phone number, please enter the phone number in the format 05xxxxxxxx");
             break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    
     } 
    }
   
    // this method we use it to ask the user about his/her name and ID
    public void DataOfPerson() {
        
        System.out.println("please enter your name");
        Name=scan.next();
        System.out.println("please enter your ID");
        Id=scan.nextLong();
    }
    
 // this is an overriding toString method ITS HELP US TO
// PRINT any information we want of the class
@Override
    public String toString() {
   return "Name= "  + Name+"\n" +"\n"  + " Id= " + getId()+"\n"  + " NumPhone= " +NumPhone+"\n";}

}