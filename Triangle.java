
package Inheritance;



public class Triangle extends Shapes{
    
    public Triangle(int length, int wrigth, int height, int base) {
        super(length, wrigth, height, base);
    }
    public int calculateArea(int length,int base){
        int area=length*base;
        System.out.println("area of the triangle is "+area);
        return area;
    
    }
    
} 

