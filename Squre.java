
package Inheritance;


public class Squre extends Shapes {
    
    public Squre(int length, int wrigth, int height, int base) {
        super(length, wrigth, height, base);
    }
     public int calculateArea(int length){
        int area=length*length;
        System.out.println("area of the rectangle is "+area);
        return area;
    
    }
    
    
}
