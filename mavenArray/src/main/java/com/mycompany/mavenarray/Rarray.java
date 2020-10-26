/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenarray;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Rarray 
{
    public static void main(String[] args) {
        Random rn= new Random();
        int a= rn.nextInt(100);
        int [] num= new int[5];
         num[0]=1;
         num[1]=2;
         num[2]=5;
         num[3]=7;
         num[4]=9;
         num[4]*=5;
         
         //System.out.println("THE NUMBERS ARE:"+num[0]);
         //System.out.println(num[1]);
        //System.out.println(num[2]);
        //System.out.println(+num[3]);
        System.out.println("YOUR RANDOM NUMBER IS: "+a);
        away(num,a);
    }


    
    public static void away(int [] raghu, int a)
    {
        
        
      for(int i=0; i< raghu.length;i++)
        {
            if(a>raghu[i])
            {
                        
            System.out.println("YOUR NUMBER IS GREATER THAN :-"+raghu[i]);
        
            }
        }
        
    }
}

