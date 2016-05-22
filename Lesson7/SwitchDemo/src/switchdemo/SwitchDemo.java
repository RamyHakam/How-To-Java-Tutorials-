/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package switchdemo;

/**
 *
 * @author eics
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Switch Demo 
        int x=10;
        switch (x) {
            case 1:
                System.out.println("Case 1" );
        break;
            case 2: 
                     System.out.println("Case 2" );
                     break;
            case 3:
                    // System.out.println("Case 3" );
                   break;
            case 4 :
                     System.out.println("Case 4" );
                   break;
            case 5:
                     System.out.println("Case 5" );
                 break;
            default :
                    // System.out.println("Default Case" );
                 break;
        }
    
    switch (x){
        case 9 : case 10 : case 11: case 12: 
                 //System.out.println("The first term" );
    break;
        case 1:
                 System.out.println("Case 1" );
        default :
                 System.out.println("default case switch 2 " );
    }
      //String in Switch 
      String sh= "feb";
      switch (sh){
          case "jan":
                   System.out.println("1" );
                   break;
          case "fab":
                   System.out.println("2" );
                   break;
                   case"march":
                            System.out.println("3" );
                            break;
                   default :
                            System.out.println("Error" );
                            
      }
      
        
    }
    
}
