/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavariables;

/**
 *
 * @author eics
 */
public class JavaVariables {
static int x =0;
static JavaVariables demo1=new JavaVariables();
static JavaVariables demo2=new JavaVariables();
   
    public static void main(String[] args) {
       //first demo x
       demo1.x=demo1.x+2;
       System.out.println("demo1 x="+demo1.x);
        // demo2  x 
       System.out.println("demo2 x="+demo2.x); 
      //local variable
       int localI=90; 
      //parameters demo
      
    }
 
    
}
