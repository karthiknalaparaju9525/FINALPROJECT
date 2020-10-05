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

public class JobEstimator {
    
    Scanner sc= new Scanner(System.in);
  static float sqft=115;
  static float labour=18;
     public static void main(String args[ ])
    {
   
    

        //8hrs = 115 sqft
        //1hr = 8/115 sqft
        
        //8hrs = 1 gallon of paint
        //1hrs = 1/8 gallon of paint
        
        //115 sqft = 1 gallon of paint
        // 1 sqft = 1/115 gallon of paint
        
        //totalpaintrequire= 1/115 * totalft;
    Scanner sc = new Scanner(System.in);
   
    float room;
    float price;
    float SqFtPerRoom;
    float totalSqFt=0;
    float laborcharge=0;
    System.out.println("ENTER THE NO OF ROOMS:");
    room=sc.nextFloat();
    for(int i=0;i<room;i++)
    {
        System.out.println("PAINT THE ROOM PER EACH SQUARE FT:");
        SqFtPerRoom=sc.nextFloat();
        totalSqFt=totalSqFt+SqFtPerRoom;
        
    }
    System.out.println("PRICE OF THE PAINT PER GALLON:");
    price=sc.nextFloat();
    System.out.println("TOTAL SQ FT :"+totalSqFt);
   
     gallonsofpaintrequired(totalSqFt);
     hoursoflaborrequired(totalSqFt);
     costofthepaint( totalSqFt, price);
      
      laborcharges( totalSqFt, laborcharge);
       totalcostofthepaintjob(totalSqFt, price);
    }

     
     public static float gallonsofpaintrequired( float totalSqFt)
    { 
           totalSqFt= (1/sqft)* totalSqFt;
           System.out.println("TOTAL AEAA REQUIRE TO PAINT:"+totalSqFt);
           return totalSqFt ;
    }


    public static float hoursoflaborrequired( float totalSqFt)
    { 
            totalSqFt= (8/sqft)* totalSqFt;
            System.out.println("HOURS REQUIRED FOR LABOUR:"+totalSqFt);
            return totalSqFt;
    }



   public static float costofthepaint( float totalSqFt,float price)
    { 
          price=(8/sqft)* totalSqFt*price;
          System.out.println("COST OF THE PAINT MATERIAL: "+price);
          return price;
    }

 
    public static float laborcharges(float totalSqFt,float laborcharge)
    { 
           laborcharge=(8/sqft)* totalSqFt*labour;
           System.out.println("LABOUR CHARGES:"+laborcharge);
           return laborcharge;
    }


     public static float totalcostofthepaintjob(float totalSqFt, float price)
    { 
           totalSqFt=  (8/sqft)* totalSqFt*price +(8/sqft)* totalSqFt*labour;
           System.out.println("TOTAL COST OF THE PAINT JOB:"+totalSqFt);
           return totalSqFt;
    }
}




    
