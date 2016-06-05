/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package nastedclassdemo;

/**
 *
 * @author eics
 */
public class NastedClassDemo {

   int x=40;
 
    public static void main(String[] args) {
        // Nasted Class Demo
     DemoClass Demo=new  DemoClass ();
       NastedClassDemo out= new NastedClassDemo();
       MyClass inner=out.new  MyClass();
       inner.TestInner();
     //  Demo.TestInner();
    }
    //inner class 
    class MyClass {
        int x= 20;
   public void TestInner(){
   
   System.out.println("x ="+x);
       System.out.println(" outer x ="+NastedClassDemo.this.x); 
   }
    
    }
  //nested static class 
    static class DemoClass{
    NastedClassDemo outer=new NastedClassDemo();
      public void TestInner(){
          
   
   System.out.println("in Static class x  ="+outer.x);
   
   }
    
    }
    
}
