/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author HP
 */

import java.util.*;
public class Month1
{
  public static void main(String args[])
 {
    Month m = new Month();
    System.out.println(" Month " + m.getMonthNumber() + " is " + m);

 for( int i=1; i<=12; i++)
 {
   m.setMonthNumber(i);
   System.out.println(" Month " + m.getMonthNumber() + " is " + m);
}
}
}
