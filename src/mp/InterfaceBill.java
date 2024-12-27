package mp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author Rayda
 */
public interface InterfaceBill {
// this is an interFace for the bill class and its like the refrens about the bill methods and fields

    double perTax = 0.15;

    public void printBill();

    public void saveBill();

    public void paying();

    @Override
    public String toString();
}

