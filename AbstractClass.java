package Dafielmoto_070317;

/**
 *
 * @author 3rd Year Account
 */
public class AbstractClass extends SuperHero{ 
    public static void main (String[] args){
        
        FlyingSuperHero fsh = new FlyingSuperHero();
        fsh.displayPower();
        Spiderman sm = new Spiderman();
        sm.displayPower();
    }
    
    @Override
    void displayPower() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}           
                

