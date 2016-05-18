/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package operatorsdemo;

/**
 *
 * @author eics
 */
public class OperatorsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //operators Examples 
        int x=2;
        int y=9;
        int z=2+12/2;
       // System.out.println("z= "+z);
       //unary operations examples
       x--;
       ++x;
   //    System.out.println("x= "+x);
       //prefix and postfix 
       int t=4;
       //prefix ++t
       //Postfix t++
       //System.out.println("t= "+t);
       //System.out.println(t++);
        //System.out.println(t);
        ///////////////////////////////
        //Relational operators 
        boolean b= 3<=3;
        boolean b2=false;
        boolean b3= !b2;
        // System.out.println("b ="+b);
         //System.out.println("b3 ="+b3);
         ////////////////////////////////////////////////
         //condational operators
         boolean q=true && false;
         boolean q2= false || true;
          System.out.println("q=" +q);
           System.out.println("q2 ="+q2);
         
    }
    
}
