/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program that asks the user to enter today's sales for five stores.
//The program should display a bar chart comparing each store's sales.
//Create each bar chart in the bar chart by displaying a row of asterisks.
//Each asterisk Should represent $100 of sales.
//Here is an example of the program's output:

//Enter today's sales for store 1: 1000 [Enter]
//Enter today's sales for store 2: 1200 [Enter]
//Enter today's sales for store 3: 1800 [Enter]
//Enter today's sales for store 4: 800 [Enter]
//Enter today's sales for store 5: 1900 [Enter]

//SALES BAR CHART
//Store 1: **********
//Store 2: ************
//Store 3: ******************
//Store 4: ********
//Store 5: *******************
package homework.lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class BarChart {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        boolean i = true;
        int storeSales1AsInt = 0;
                
        while(i==true) {
        JOptionPane.showMessageDialog(null, "Enter todays sales for the five stores.");
        String storeSales1AsString = JOptionPane.showInputDialog("First store's sales today");
        storeSales1AsInt = Integer.parseInt(storeSales1AsString);
        if (storeSales1AsInt > 0) {
            i = false;
        }
        else { 
            JOptionPane.showMessageDialog(null, "Please enter a positive number.");
        }
        }
        System.out.print("Store 1: ");
       int sales1 = storeSales1AsInt/100;
        for (int v = 0; v<sales1 ; v++){
            System.out.print("*");
    }
        boolean j = true;
        int storeSales2AsInt = 0;
                
        while(j==true) {
        String storeSales2AsString = JOptionPane.showInputDialog("Second store's sales today");
        storeSales2AsInt = Integer.parseInt(storeSales2AsString);
        if (storeSales2AsInt > 0) {
            j = false;
        }
        else { 
            JOptionPane.showMessageDialog(null, "Please enter a positive number.");
        }
        }
        System.out.println("");
        System.out.print("Store 2: ");
       int sales2 = storeSales2AsInt/100;
        for (int v = 0; v<sales2 ; v++){
            System.out.print("*");
        }
        boolean k = true;
        int storeSales3AsInt = 0;
                
        while(k==true) {
        String storeSales3AsString = JOptionPane.showInputDialog("Third store's sales today");
        storeSales3AsInt = Integer.parseInt(storeSales3AsString);
        if (storeSales3AsInt > 0) {
            k = false;
        }
        else { 
            JOptionPane.showMessageDialog(null, "Please enter a positive number.");
        }
        }
        System.out.println("");
        System.out.print("Store 3: ");
       int sales3 = storeSales3AsInt/100;
        for (int v = 0; v<sales3 ; v++){
            System.out.print("*");
        }
        boolean l = true;
        int storeSales4AsInt = 0;
                
        while(l==true) {
        String storeSales4AsString = JOptionPane.showInputDialog("Forth store's sales today");
        storeSales4AsInt = Integer.parseInt(storeSales4AsString);
        if (storeSales4AsInt > 0) {
            l = false;
        }
        else { 
            JOptionPane.showMessageDialog(null, "Please enter a positive number.");
        }
        }
        System.out.println("");
        System.out.print("Store 4: ");
       int sales4 = storeSales4AsInt/100;
        for (int v = 0; v<sales4 ; v++){
            System.out.print("*");
        }
        boolean m = true;
        int storeSales5AsInt = 0;
                
        while(m==true) {
        String storeSales5AsString = JOptionPane.showInputDialog("Fifth store's sales today");
        storeSales5AsInt = Integer.parseInt(storeSales5AsString);
        if (storeSales5AsInt > 0) {
            m = false;
        }
        else { 
            JOptionPane.showMessageDialog(null, "Please enter a positive number.");
        }
        }
        System.out.println("");
        System.out.print("Store 5: ");
       int sales5 = storeSales5AsInt/100;
        for (int v = 0; v<sales5 ; v++){
            System.out.print("*");
        }
    }
}


