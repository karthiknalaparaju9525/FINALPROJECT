/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenarray;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class initailarray
{
    public static void main(String[] args) {
       float [] total={3.4F, 55.7F ,89.1F ,12.4F ,7.35F ,98.3F};
       
      float average= getaverage(total);
      float sum=getsum(total);
      float highest=gethighest(total);
      float lowest=getlowest(total);
    System.out.println("AVERAGE:"+average);
    System.out.println("SUM OF TOTAL:"+sum);
    System.out.println("HIGHEST :"+highest);
    System.out.println("LOWEST:"+lowest);
     
     
    }
     public static float getaverage(float [] total)
      {
         float testscore=0;
         float totalaverage=0;
         for(int i=0;i<total.length;i++)
         {
         testscore+=total[i];
         }
         totalaverage=(testscore/total.length);
         
         return totalaverage;
                 
      }
    
     public static float getsum(float [] total)
      {
          float testscore=0;
         
         for(int i=0;i<total.length;i++)
         {
         testscore=testscore+total[i];
         }
         
         return testscore;
      }
    
     public static float gethighest(float [] total)
      {
          float high=0;
         
         for(int i=0;i<total.length;i++)
         {
         if(total[i]>high)
         {
             high= total[i];
         }
         }
         
         return high;
      }
    
     public  static float getlowest(float [] total)
      {
          float low=100;
          for(int i=0;i<total.length;i++)
         {
         if(total[i]<low)
         {
             low= total[i];
         }
         }
          return low;
      }
    
    
    
    
}
