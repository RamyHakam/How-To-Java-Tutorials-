/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package pkgwhile.demo;

/**
 *
 * @author eics
 */
public class WhileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // While Demo
        int x =0;
        while (x>5){
        
        System.out.println("Currant x ="+x);
        x++;
        }
    
        do {
          System.out.println("Currant x ="+x);
        x++; 
        
        } while(x>5);
        
    }
    
}
