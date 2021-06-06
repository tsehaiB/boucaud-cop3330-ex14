/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    final static double taxRate = .055;
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int amount = myApp.readAmount();
        String state = myApp.readState();
        double total = amount;
        if(state.equals("WI")){
            double tax = myApp.calcTax(amount);
            System.out.println("The tax is $" + tax + ".");
            total = myApp.calcTotal(amount, tax);
        }
        System.out.println("The total is $" + total + ".");
    }
    private int readAmount(){
        System.out.print("What is the order amount? ");
        return Integer.parseInt(inp.nextLine());
    }
    private String readState(){
        System.out.print("What is the state? ");
        return inp.nextLine();
    }
    private double calcTax(int amount){
        return amount * taxRate;
    }
    private double calcTotal(int amount, double tax){
        return amount + tax;
    }
}
