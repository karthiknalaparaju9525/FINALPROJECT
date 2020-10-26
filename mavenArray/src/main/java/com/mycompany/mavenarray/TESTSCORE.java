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
public class TESTSCORE {
    



   private float[] scores;
   float sum = 0;

   public TESTSCORE(float array[]) {
      
       for (int i = 0; i < array.length; i++) {
           scores = new float[array.length];
        
           if (array[i] < 0 || array[i] > 100) {
        
               throw new IllegalArgumentException(
                      
                       "NOT A EXACT SCORE" + "\n\tInvalid score found." + "\n\tELEMENTS: " + i + "\n\t SCORE GAINED: " + array[i]);
           } else {
               
               scores[i] = array[i];
               sum += array[i];
           }
       }
   }

   public float getAve() {
       return sum / scores.length;
   }
}
