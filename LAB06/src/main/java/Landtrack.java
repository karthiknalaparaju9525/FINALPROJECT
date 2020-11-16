
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
public class Landtrack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE DIMENSION OF LAND 1:");
        float landonelenght= sc.nextFloat();
              float landonewidth = sc.nextFloat();
       
        System.out.println("ENTER THE DIMENSION OF LAND 2:");
        float landtwolenght = sc.nextFloat();
        float landtwowidth=sc.nextFloat();
        
        landtrckobject track1= new landtrckobject(landonelenght,landonewidth);
        landtrckobject track2 = new landtrckobject(landtwolenght, landtwowidth);        
        
        
        float track1area= track1.AREALAND();
        
        float track2area = track2.AREALAND();
        
        System.out.println("TRACK1 AREA:-"+track1area);
        
        System.out.println("TRACK2 AREA:-" + track2area);
        
        String equal=track1.EQUALS(track1area, track2area);
        track1.landtoString(equal);
        
    }
    
   
}
