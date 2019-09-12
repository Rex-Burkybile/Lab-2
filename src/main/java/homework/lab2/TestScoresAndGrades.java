/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//4. Test Scores and Grade

//Write a program that has variables to hold three test scores.
//The program should ask the user to enter three test scores and assign the values entered to the variables.
//The program should display the average of the test scores and the letter grade that is assigned for the test score average.
//Use the grading scheme below:

//90-100 = A

//80-89 = B

//70-79=C

//60-69=D

//Below 60=F
package homework.lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800490
 */
public class TestScoresAndGrades {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Enter in your 3 test scores.");
        
        float firstTestAsFloat = 0;
        boolean i = true;
        while (i == true) {
            JOptionPane.showMessageDialog(null, "Enter first test score");
            
            String firstTestAsString = JOptionPane.showInputDialog("Test score");
            
            firstTestAsFloat = Float.parseFloat(firstTestAsString);
            
            if (firstTestAsFloat < 101 && firstTestAsFloat > -1) {
                i = false;
                        }
            else JOptionPane.showMessageDialog(null, "That isn't a vaild test score please enter a vaild score.");
            
        }
        
        boolean j  = true;
        float secondTestAsFloat = 0;
        while (j == true) {
            JOptionPane.showMessageDialog(null, "Enter second test score");
            
            String secondTestAsString = JOptionPane.showInputDialog("Test score");
            
            secondTestAsFloat = Float.parseFloat(secondTestAsString);
            
            if (secondTestAsFloat < 101 && secondTestAsFloat > -1) {
                j = false;
                        }
            else JOptionPane.showMessageDialog(null, "That isn't a vaild test score please enter a vaild score.");
            
        }
        
        boolean k = true;
        float thirdTestAsFloat = 0;
        while (k == true) {
            JOptionPane.showMessageDialog(null, "Enter third test score");
            
            String thirdTestAsString = JOptionPane.showInputDialog("Test score");
            
            thirdTestAsFloat = Float.parseFloat(thirdTestAsString);
            
            if (thirdTestAsFloat < 101 && thirdTestAsFloat > -1) {
                k = false;
                        }
            else JOptionPane.showMessageDialog(null, "That isn't a vaild test score please enter a vaild score.");
            
        }
        
       float testScoreAVG = (firstTestAsFloat + secondTestAsFloat + thirdTestAsFloat)/3;
        
       if (testScoreAVG >= 90) {
               System.out.println("Your average test grade is " + testScoreAVG + " and your average letter grade is 'A'" );
       }
       else if(testScoreAVG >= 80 && testScoreAVG <=89) {
               System.out.println("Your average test grade is " + testScoreAVG + " and your average letter grade is 'B'" );

                }
       else if (testScoreAVG >= 70 && testScoreAVG <=79) {
               System.out.println("Your average test grade is " + testScoreAVG + " and your average letter grade is 'C'" );
       
       }
       else if (testScoreAVG >= 60 && testScoreAVG <=69)  {
               System.out.println("Your average test grade is " + testScoreAVG + " and your average letter grade is 'D'" ); 
       } 
       else {
           System.out.println("Your average test grade is " + testScoreAVG + " and your average letter grade is 'F'" );
       }
           
    }
}
