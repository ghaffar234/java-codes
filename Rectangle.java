
package Inheritance;


public class Rectangle extends Shapes {
    
    public Rectangle(int length, int wrigth, int height, int base) {
        super(length, wrigth, height, base);
    }
    public int calculateArea(int length,int height){
        int area=length*height;
        System.out.println("area of the rectangle is "+area);
        return area;
    
    }
    
    
    
}
