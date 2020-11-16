/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class landtrckobject {
    
    float length=0;
    float width=0;
    
 public landtrckobject(float length, float width)
    {
    this.length= length;
    this.width=width;
 
    }

    public landtrckobject() {
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
   public float AREALAND()
   {
       float area= length* width;
       return area;
   }
   
   public String EQUALS(float area1, float area2)
   {
       String isEQUAL;
       if(area1== area2)
       {
           isEQUAL="TWO LANDS ARE OF SAME SIZE";
       }
       else
       {
           isEQUAL="THEY ARE NOT OF SAME SIZE";
       }
       return isEQUAL;
       
       
   }
   
   public void landtoString(String EQUALS)
   {
   System.out.println(EQUALS);
   }
}

     
