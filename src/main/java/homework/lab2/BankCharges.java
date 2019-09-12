/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:

//$0.10 each for less than 20 checks

//$0.08 each for 20-39 checks

//$0.06 each for 40-59 checks

//$0.04 each for 60 or more checks

//Write a program that asks for the number of checks written for the month. 
//The program should then calculate and display the banks service fees for the month. 
package homework.lab2;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class BankCharges {
  public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        float amountOfChecksAsFloat = 0;
        boolean i = true;
        
        while (i == true){
        JOptionPane.showMessageDialog(null, "How many checks did you write this month?");
        
        String amountOfChecksAsString = JOptionPane.showInputDialog("Checks written");
        amountOfChecksAsFloat = Float.parseFloat(amountOfChecksAsString);
        if (amountOfChecksAsFloat >0) {
            i = false;
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter a Valid number");
        }
            
        }
        float amountOwed = 0;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        if (amountOfChecksAsFloat < 20) {
            amountOwed = (amountOfChecksAsFloat * .10F) + 10F;
            System.out.println("You owe the bank " + money.format(amountOwed) + " this month." );
  }
        else if (amountOfChecksAsFloat >= 20 && amountOfChecksAsFloat <=39 ) {
            amountOwed = (amountOfChecksAsFloat * .08F) + 10F;
            System.out.println("You owe the bank " + money.format(amountOwed) + " this month." );
}
        else if (amountOfChecksAsFloat >= 40 && amountOfChecksAsFloat <=59 ) {
            amountOwed = (amountOfChecksAsFloat * .06F) + 10F;
            System.out.println("You owe the bank " + money.format(amountOwed) + " this month." );
        }
        else if (amountOfChecksAsFloat >= 60 ) {
            amountOwed = (amountOfChecksAsFloat * .04F) + 10F;
            System.out.println("You owe the bank " + money.format(amountOwed) + " this month." );
        }
}
}
