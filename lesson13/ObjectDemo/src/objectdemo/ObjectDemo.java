/*
 * This Simple Code is Written by Ramy Hakam .
 * For How To Program Java tutorials on Z-Team YouTube Channel 
 * You can Use it in any Form Good Luck .
 */
package objectdemo;

/**
 *
 * @author ramy
 */
public class ObjectDemo {
//Create an object from MyClass
   static MyClass ObjectD=new MyClass(); 
    public static void main(String[] args) {
       //Call X value of MyClass
        String A= ObjectD.X;
       System.out.println("Ths value of X   "+A);
       //Invoke Test method 
       ObjectD.test();
      System.out.println("Ths value of X after test invokation    "+ObjectD.X);
      
      String B=ObjectD.test2("This is argm value of X");
      System.out.println("Ths value of X after test2 invokation    "+B);       
       
    }
    
}
