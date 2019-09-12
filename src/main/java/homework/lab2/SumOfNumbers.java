/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program that asks the user for a positive nonzero integer value.
//The program should use a loop to get the sum of all the integers from 1 up to the number entered.
//For example, if the user enters 50, the loop will find the sum of 1,2,3,4...50.
package homework.lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class SumOfNumbers {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        boolean i = true;
        int userNumberAsInt = 0;
                
        while(i==true) {
        JOptionPane.showMessageDialog(null, "Enter a postive nonzero number.");
        String userNumberAsString = JOptionPane.showInputDialog("Your number please");
        userNumberAsInt = Integer.parseInt(userNumberAsString);
        if (userNumberAsInt > 0) {
            i = false;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a number that is valid.");
        }
        }
        
        int counter = 0;
        
        for (int j=0;j <= userNumberAsInt; j++ ) {
            counter = counter + j;
        }
    System.out.println("The sum of 1 to " + userNumberAsInt + " is " + counter ); 
}
}
