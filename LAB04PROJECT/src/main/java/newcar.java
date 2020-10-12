/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
public class newcar
{
public int YEAR;
    public String   MAKING;
    public int      vehiclespeed;
    
              
    
    public int getYEAR()
    {
        return YEAR;
    }

    public void setYEAR(int year) {
        this.YEAR = year;
    }

    public String getMAKING() {
        return MAKING;
    }

    public void setMAKING(String make) {
        this.MAKING = make;
    }

    public int getSPEED() {
        return vehiclespeed;
    }

    public void setSPEED(int speed) {
        this.vehiclespeed = speed;
    }
    
    
    public void ACCELERATION(){
        vehiclespeed += 5;
    }
    
    public void brake(){
        vehiclespeed -= 5;
    }
    
    public newcar(int newYearModel, String newMake){
       YEAR = newYearModel;
       MAKING = newMake;  
     vehiclespeed = 0;
    }
}



