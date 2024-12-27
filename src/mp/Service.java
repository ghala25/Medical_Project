package mp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Rayda
 */
public abstract class Service {
    
    // here we creat 3 Array Lists to do several services
     // this array will contain the servises name

    private ArrayList <String> arrayService = new ArrayList<>();;
    
     // this one will contain the service price
    private ArrayList <Double> arrayPrice  =new ArrayList<>();;
    
     // this array will shows user's enter services
    private ArrayList <Integer> arrayRequest  =new ArrayList<>();;
  

// defult constracter
    public Service() {
    }
     // using set method to replce a string elements position,
    // it didn't have a return type
    public void setArrayService(ArrayList<String> arrayService) {
        this.arrayService = arrayService;
    }
     // using set method to replce a double elements position,
    // it have a void return type
    public void setArrayPrice(ArrayList<Double> arrayPrice) {
        this.arrayPrice = arrayPrice;
    }
    
     // using set method to replce a Integer elements position,
    // it have a void return type
     public void setArrayRequest(ArrayList<Integer> arrayRequest) {
        this.arrayRequest = arrayRequest;
    }
    // using get method to return an Integer elements position,
    // it's have a return type which is "arrayRequest"
    public ArrayList<Integer> getArrayRequest() {
        return arrayRequest;
    }
     // using get method to return a string elements position,
    // it's have a return type which is "arrayService"
    public ArrayList<String> getArrayService() {
        return arrayService;
    }
     // using get method to return a double elements position,
    // it's have a return type which is "arrayPrice"
    public ArrayList<Double> getArrayPrice() {
        return arrayPrice;
    }

    // this method will insert an entered elements
     public void addRequest(int i){
        arrayRequest.add(i);
        
    }
  /*they allow other classes or methods to retrieve specific information from
  the arrayRequest and arrayPrice ArrayLists, respectively 
     For example, if a user wants to know the price of a specific service 
     at a given index the method giveArrayPrice will helps. 
    otherwise, we used giveRequestItem to help us in the subClass like:
     when the user put the number of the service it will search about the service's index
     
     */
    public Double giveArrayPrice(int i){
    
        return arrayPrice.get(i);
    
    }
    public int giveRequestItem(int i){
    
    return arrayRequest.get(i);
    }
    // by this method we can add the price and service name to the "ARRAYSERVISE" and "ARRAYPRICE"
   public void addToArrayService (String ServiseName, double price){
   this.arrayService.add(ServiseName);
   this.arrayPrice.add(price);
   arrayRequest.add(arrayService.indexOf(ServiseName));
   }
 
   
   // this is an abstract method and we use it in the sub classes
    public abstract void infoService();
    
    
    // this is an equal method and its  will helps to comaring between the giving objects
    @Override
    public boolean equals(Object obj) {
         Service other = (Service) obj;
        if (!Objects.equals(this.arrayService, other.arrayService)) {
            return false;
        }
        if (!Objects.equals(this.arrayPrice, other.arrayPrice)) {
            return false;
        }
        if (!Objects.equals(this.arrayRequest, other.arrayRequest)) {
            return false;
        }
        return false;
    }
    // this is an overriding toString method ITS HELP US TO
    // PRINT any information we want of the class
    @Override
    public String toString() {
        
        return "Service you've choose and their Price = " + arrayService;
    }
    
}
