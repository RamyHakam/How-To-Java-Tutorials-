/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package instanceofdemo;

/**
 *
 * @author eics
 */
public class Instanceofdemo {

   
    public static void main(String[] args) {
        // instantce of demo 
        Parant obj1=new Parant ();
        Child obj2= new Child();
        boolean x= obj1 instanceof Parant ;
         boolean y= obj2 instanceof Parant ;
         boolean z= obj1 instanceof Child ;
          boolean A= obj2 instanceof Child ;
        System.out.println( x);
        System.out.println( y);
        System.out.println( z);
        System.out.println( A);
    }
    
}
class Parant {}
interface MyInterface{}
class Child extends Parant implements MyInterface{}
