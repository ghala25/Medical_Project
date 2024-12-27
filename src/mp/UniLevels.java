package mp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rayda
 */
/* this class is a sub class that inherited a Service class also 
 * This class represents university levels. It provides methods to handle
 * different levels of university education and display special courses based on the level chosen.
 */
public class UniLevels extends Service {

    // create 2 private fields
    private int NumberOfLevel;
    private double sum;

    //defult constracter
    public UniLevels() {
        super();
    }

    // a constracter with parameter

    public UniLevels(int NumberOfLevel, double sum) {
        this.NumberOfLevel = NumberOfLevel;
        this.sum = sum;
    }

    // Getter and Setter mwethods
    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNumberOfLevel() {
        return NumberOfLevel;
    }

    // create a Scanner object to allow the user to answer the giving questions
    Scanner scan = new Scanner(System.in);

    /*
     this method will helps when the user put its uniLevel it will represents 
     many services that related to its uniLevel by using IF-STATMENT
     */
    public void levelSer() throws FileNotFoundException {
        System.out.println("What's your university level?");
        NumberOfLevel = scan.nextInt();
        if (NumberOfLevel == 1) {
            System.out.println("Do you want to see our Level 1 courses? (yes/no)");
            String x = scan.next();
            if (x.equalsIgnoreCase("yes")) {

                File myObj = new File("level1.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    String[] parts = data.split(",");
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    this.addToArrayService(name, price);
                }
                myReader.close();
                
                this.sum = 0;
            } else {
                System.out.println("Thanks");
            }
        } else if (NumberOfLevel == 2) {
            System.out.println("Do you want to see our Level 2 courses? (yes/no)");
            String x = scan.next();
            File myObj = new File("level2.txt");
            if (x.equalsIgnoreCase("yes")) {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    String[] parts = data.split(",");
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    this.addToArrayService(name, price);
                }
                this.sum = 0;
            } else {
                System.out.println("Thanks");
            }
        } else if (NumberOfLevel == 3) {
            System.out.println("Do you want to see our Level 3 courses? (yes/no)");
            String x = scan.next();
            if (x.equalsIgnoreCase("yes")) {
                File myObj = new File("level3.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    String[] parts = data.split(",");
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    this.addToArrayService(name, price);
                }
                myReader.close();

                this.sum = 0;
            } else {
                System.out.println("Thanks");
            }
        } else if (NumberOfLevel < 3) {
            System.out.println("Sorry we just have 3 levels");

        }
    }

    // here we add impiemnt for the abstractg method and we use it to asks the user if he want to see the srvices
    // if the user put yes the method will calls the levelSer method and it will start to works
    @Override
    public void infoService() {
        System.out.println("Do you want to see our special courses? (yes/no)");
        String x = scan.next();
        if (x.equalsIgnoreCase("yes")) {
            try {
                levelSer();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UniLevels.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (NumberOfLevel < 3 || NumberOfLevel == 3) {
                System.out.println("Please enter the number of the service");
                System.out.println("If you do not want any service, enter any number larger than " + getArrayService().size());
                for (int i = 0; i < getArrayService().size(); i++) {
                    System.out.println(getArrayService().get(i));
                }
                int y;
                while (true) {
                    y = scan.nextInt();
                    if (y < 1 || y > this.getArrayService().size()) {
                        break;
                    }
                    sum += giveArrayPrice(y - 1);
                    this.addRequest(y - 1);
                    System.out.println("Do you want another service? Choose one");
                }

                System.out.println("Total price: " + sum);
            } else {
                System.out.println("Sorry we just have 3 levels");
            }

        } else {
            System.out.println("Thanks");
        }

    }
}
