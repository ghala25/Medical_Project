package mp;
import java.io.*;
import java.util.Scanner;

/**
 * 2
 *
 * @author Rayda
 */
public class MedicalProject {

    public static void main(String[] args) {

        // two print statment 
        System.out.println("Welcome to Virtual Medical Academy");
        System.out.println("Do you want to join with us? [yes/no]");
        // inshlize an scanner object to allow to the user writing if he want or not to join
        Scanner scan = new Scanner(System.in);
        String y;
        y = scan.next();
        // an if statement to ask if the user want to join and seeing the services or no
        // if the user put ""yes" it will calls the classes to start working 
        if (y.equalsIgnoreCase("yes")) {

            //CREATE OBJECT HAS A PERSON TYPE 
            Person person = new Person();
       //calling a needed methods to start work
            // person.DataOfPerson();
            //person.setNumPhone(0);

            //CREATE OBJECT HAS A UniLevels TYPE 
            UniLevels uni = new UniLevels();
            //calling a needed method to start work
            uni.infoService();

            //CREATE OBJECT HAS A GeneralCourse TYPE 
            GeneralCourse g = new GeneralCourse();

            //CREATE OBJECT HAS A Bill TYPE 
            Bill bil = new Bill(person, uni, g);
            //calling a needed methods to start work
            bil.printBill();
            bil.saveBill();
        } else {
            System.out.println("thank you, we hope you visit us again");
        }

        // an write file 
        try {
            File writeFile = new File("test_file.txt");

            try (PrintWriter outputFile = new PrintWriter(writeFile)) {
                outputFile.println("welcome to our project with spicial services and courses");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not exist");

        }

    }

}
