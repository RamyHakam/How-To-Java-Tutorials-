/*
 * This code has no license .
 * It's Provided to you by the Z-Team "Ramy Hakam".
 * You are Free to use it in any form.
 */
package constructorsdemo;

/**
 *
 * @author eics
 */
public class ConstructorsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constructors Demo
        Rectangle obj1=new Rectangle();
        Rectangle obj2=new Rectangle(50,70);
     /*   System.out.println("obj2 w ="+obj2.w);
            System.out.println("obj2 h ="+obj2.h);
                System.out.println("obj1 w ="+obj1.w);
                    System.out.println("obj1 h ="+obj1.h);
*/
     obj2.test("testdemo", 2,7,8,100,400,5000);
}
    public static  class Rectangle {
    
    int w;
    int h;
    public Rectangle (){
    w=20;
    h=40;
    
    }
    public Rectangle(int x,int y){
    w=x;
    h=y;
    
    }
    public void test(String s,int... x){
    System.out.println ("S= "+s);
    int l=x.length;
for (int i=0;i<l;i++){
   System.out.println ("var# "+i +"= "+x[i]);
}    
    }
    
    }
    
}
