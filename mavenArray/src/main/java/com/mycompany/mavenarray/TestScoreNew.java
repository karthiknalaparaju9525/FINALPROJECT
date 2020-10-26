/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenarray;

/**
 *
 * @author HP
 */
public class TestScoreNew {
    


   public static void main(String[] args) throws Exception {
       
       float[] invalid = { 27.3F, 44.2F, 56.0F, 120.0F, 89.0F };
       float[] valid = { 77.5F, 13.7F, 93.0F, 180.0F, 66.0F };
       TESTSCORE TEST1 = null;
       
       try {
           TEST1 = new TESTSCORE(invalid);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       
       try {
           TEST1 = new TESTSCORE(valid);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       System.out.print("BEST SCORE:" + "\n\t AVERGE OF THE SCORES: " + TEST1.getAve());
   }  
}