/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class MONTHCLASS 
        
{
    
    
    int[] monthAR=new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
    int monthNUM=0;
    String[] arr=new String[]{"JANUARY"," FEBRUARY"," MARCH","APRIL", "MAY","JUNE", "JULY,AUGUST", "SEPTEMBER","OCTOBER", "NOVEMBER", "DECEMBER"};
    String monthname;
    
    public MONTHCLASS()
    {
       this.monthNUM=1;
    }
    
    public MONTHCLASS(int monthNUM1)
    {
     if(monthNUM1>=1 &&monthNUM1<=12)
     {
     this.monthNUM=monthNUM1;
     }
     else
     {
     this.monthNUM=1;
      this.monthname= arr[0];
     }
    }
    
    public  MONTHCLASS(String monthname1)
    {
          for(int a=0;a<12;a++)
          {
            if(monthname1.equalsIgnoreCase(this.arr[a]))
            {
            this.monthNUM=a+1;
            this.monthname=monthname1;
            }
            else
            {
            this.monthNUM=1;
            this.monthname=arr[0];
            }
            
            
          }
    }
     public void setMonthNumber(int monthNUM1)
    {
     if(monthNUM1>=1 &&monthNUM1<=12)
     {
     this.monthNUM=monthNUM1;
     }
     else
     {
     this.monthNUM=1;
      this.monthname= arr[0];
     }
    }
     public int getMonthNumber()
     {
     return monthNUM;
     }
     
     public String getMONTHNAME()
     {
       return monthname;
     }

    @Override
    public String toString() {
        return this.monthname;
    }
     
    public boolean equals(MONTHCLASS month1)
    {
      return(this==month1);
    }
    
    public boolean GREATERTAN(MONTHCLASS month1)
    {
      if(this.monthNUM> month1.monthNUM)
      {
      return true;
      }
      else
      {
          return false;
      }
    }
     public boolean LESSTHAN(MONTHCLASS month1)
    {
      if(this.monthNUM < month1.monthNUM)
      {
      return true;
      }
      else
      {
          return false;
      }
    }
    
    
    }
     
    

