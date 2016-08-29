/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package anonyclassdemo;

/**
 *
 * @author eics
 */
public class AnonyClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void demo(){
    
    myinterface anony =new myinterface(){
    public void output(String x){
    String name=x;
    System.out.println("name"+ name);
    
    }
    
    };
    
    }
    
}
