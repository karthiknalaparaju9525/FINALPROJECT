/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class CIRCLE {
    
   
   private double RAD;
   private final double PI = 3.14159;
  
   CIRCLE(double RAD){
       setRad(RAD);
   }
  
   CIRCLE(){
       setRad(0.0);
   }
  
   void setRad(double radius){
       this.RAD = radius;
   }
  
   double getRad(){
       return this.RAD;
   }
  
   double getArea(){
       return PI * RAD * RAD;
   }
  
   double getDIAMETER(){
       return RAD * 2;
   }
  
   double getCIRCUMFERENCE(){
       return 2 * PI * RAD;
   }
}

