
import java.util.Random;



public class oddOReven {
    
 
 
    
    public static void main(String[] aa)
    {
        int even=0;
        int odd=0;
        int random=100;     
       Random value= new Random();
        
        for(int i=1;i<random;i++)
        {
            if(isEven(value.nextInt(i)))
                
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
            
        }
    
    System.out.println("TOTAL NO OF EVEN NUMBERS: "+even);
    System.out.println("TOTAL NO OF ODD NUMBERS: "+odd);
    }
       
   
    
    public static boolean isEven(int num) {
    boolean isEvenNumber = false;

    if ((num % 2) == 0) {
        isEvenNumber = true;
    }
    return isEvenNumber;

}


 
}
