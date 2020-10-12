/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class CAR
{

    public static void main(String[] args)
    {
        newcar aCar = new newcar(2020, "MERCEDES BENZ");
        
        
       System.out.println("CAR OF THE YEAR: " + aCar.getYEAR());
       System.out.println("CAR MAKING: " + aCar.getMAKING());
       System.out.println();
      
       
       for(int i = 0; i < 5; i++)
       {
           aCar.ACCELERATION();
           System.out.println("THE RIGHT NOW CURRENT SPEED: " + aCar.getSPEED());
       }
      
       
       for(int i = 0; i < 5; i++)
       {
           aCar.brake();
           System.out.println("Current speed of the car: " + aCar.getSPEED());
       }
    }
   
}    

