/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author eics
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array demo 
        int[]x;
        x=new int [10];
        x[0]=10;
        x[1]=20;
        x[2]=30;
        int[] y={1,2,4,5,6,7};
        //System.out.println("element in index 2 =  "+x[2]);
        //Multidimiantional arrays 
        String [][] s;
        s=new String [2][3];
        //copy array 
      char [] src={'z','t','e','a','m','j','a','v','a'};
      char dest [];
      dest =new char [4];
      System.arraycopy(src, 5, dest, 0, 4);
      System.out.println("the copy resutle=  "+new String(dest));
      //copy with java.util.arrays
       char [] src2={'z','t','e','a','m','j','a','v','a','p','r','o'};
       char []dest2=java.util.Arrays.copyOfRange(src2, 5, 12);
        System.out.println("the copy with java.util=  "+new String(dest2));
      
      
    }
    
}
