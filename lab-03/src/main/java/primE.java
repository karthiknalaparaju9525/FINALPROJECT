/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class primE {
   
    
    public static void main(String[] args) {
        int num=0;
         IsPrime(num);
    }
       
    
       public static int IsPrime(int num)
       {
           Scanner sc= new Scanner(System.in); 
          int b=0;
          System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        
       
       
       for(int i=2;i<num-1;i++)
       {
        if((num % i)==0)
        {
            b=b+1;
            
        }
       }
       if(b==0)
       {
           System.out.println("PRIME NO.");
       }
       else
       {
           System.out.println("NOT PRIME");
       }
      return (num);
       }

   
    }






    



