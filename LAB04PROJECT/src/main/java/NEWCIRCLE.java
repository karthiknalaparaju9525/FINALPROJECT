
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NEWCIRCLE {
    

 
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter radius of the circle: ");
       double radius = in.nextDouble();  
       CIRCLE circlea = new CIRCLE(radius);   
       System.out.println("CALCULTION FOR THE CIRCLE GIVEN DIMENSIONS:");
       
       System.out.println("CIRCLE RADIUS: " + circlea.getRad());
      
       System.out.println("AREA CIRCLE: " + circlea.getArea());
       
       System.out.println("CICLE DIAMETER: " + circlea.getDIAMETER());
       
       System.out.println("CIRCLE CIRCUMFERENCE: " + circlea.getCIRCUMFERENCE());
       
       System.out.println("THERE THIS IS THE GIVEN ANSWER:");
    }
}
