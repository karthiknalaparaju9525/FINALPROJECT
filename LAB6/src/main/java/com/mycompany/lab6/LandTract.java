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
public class LandTract
 {
  public int length,width,area;
  
  public LandTract ()
  {
      length=0;
      width=0;
      area=0;
  }

 public LandTract (int length,int width)
  {
      this.length=length;
      this.width=width;
  }

  public void setArea(int area)
  {
      this.area=area;
   }

  public static int area(int length,int width)
  {
      return length*width;
  }

  public boolean equals(LandTract lt)
{
   boolean equals;
   if(length == (lt.length) && width == (lt.width) || length == (lt.width)  && width == ( lt.length))
        equals=true;
else
      equals = false;
return equals;
}

public String toString()
{
  String str = ("LandTract" + " with len " +  length + ", width " + width + ", and area" + area);
return str;
}

public static void main(String args[])
{
  int len1 = 0;
  int width1 =0;
  int area1 = 0;

  int len2 = 0;
  int width2 =0;
  int area2 = 0;

  Scanner sc = new Scanner(System.in);

System.out.print(" Enter length of first land tract: \n");
len1=sc.nextInt();

System.out.print(" Enter width of first land tract: \n");
width1=sc.nextInt();

LandTract land1 = new LandTract (len1,width1);

area1= LandTract.area(len1,width1);

land1.setArea(area1);
  
System.out.print(" Enter length of second land tract: \n");
len2=sc.nextInt();

System.out.print(" Enter width of second land tract: \n");
width2=sc.nextInt();

LandTract land2 = new LandTract (len2,width2);

area2= LandTract.area(len2,width2);

land2.setArea(area2);
  
System.out.println(land1.toString());

System.out.println(land2.toString());

if(land1.equals(land2))
{
   System.out.println("Two tracts have same size");
}
else           
        
   System.out.println("Two tracts do not have same size");

}
}