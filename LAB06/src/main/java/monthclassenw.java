/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class monthclassenw 
{
    public static void main(String[] args) {
       
     MONTHCLASS m1;
        m1 = new MONTHCLASS(-1);
        MONTHCLASS m2 = new MONTHCLASS(-1);
        System.out.println("MONTH FROM ONE TYPE: " + m1);
        System.out.println("MONTH FROM SECOND TYPE: " + m2);
        System.out.println("IS BOTH TYPES ARE EQUAL: " + m1.equals(m2));
    }
    
    
}
