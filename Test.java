
package Inheritance;

public class Test {
    public static void main(String[] args) {
        Shapes s=new Shapes(3,4,6,7);
        Triangle t=new Triangle(5,7,3,4);
        t.calculateArea(2, 8);
       Rectangle R=new Rectangle(3,4,6,7);
       R.calculateArea(4, 5);
       Squre S=new Squre (3,4,6,7);
       S.calculateArea(5);
       
        
        
    }
    
}
