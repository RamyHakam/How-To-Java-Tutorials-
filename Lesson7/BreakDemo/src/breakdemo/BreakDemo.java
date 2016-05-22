/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package breakdemo;

/**
 *
 * @author eics
 */
public class BreakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Break Demo 
        int x,y,t;
        for( x=0;x<10;x++){
     //   System.out.println( "Currant x ="+x);
        if (x==5){
        break;}
        }
        
        //labled break
        test:
        for ( y=0;y<3;y++){
        for ( t=0;t<4;t++){
         System.out.println( "Currant y="+y +" Currant t ="+t);
         
      if ( t==2){
      break test;
      }
        }
        
        //continue demo
       for( x=0;x<10;x++){
             if (x==5){
        continue;}
      //  System.out.println( "Currant x ="+x);
      
        }
        
        //labled cantinue
       test1:
        for ( y=0;y<3;y++){
        for ( t=0;t<4;t++){
         System.out.println( "Currant y="+y +" Currant t ="+t);
         
      if ( t==2){
      continue test1;
      }
        }
        
        
        
        
        }
        
        
      
    }
        
        
    }
}
    

