/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package localclassdemo;

/**
 *
 * @author eics
 */
public class LocalClassDemo {
final int v1=30;
int v2=50;   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    //Local Class Demo 
    public void demo1(){
    
    int x=30;
    //Local Class
    class DemoClass{
        static  final int e=40;
    public void testM(){
    //Java 8+ only 
    System.out.print(x);
    //Java 6,7
     System.out.print(v1);
     //Java 8+ only 
      System.out.print(v2);
    }
    
    }
    
    }
    
}
