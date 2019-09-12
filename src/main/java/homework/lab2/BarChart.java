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
        JOptionPane.showMessageDialog(null, "Enter a postive nonzero number.");
    }
  
}
