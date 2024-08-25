
package Abstraction;

public class Test {
    public static void main(String[] args) {
         try{
             Triangle t=new Triangle();
        Circle c = new Circle();
        Triangle t1=(Triangle)c;
        Circle c1=new Triangle();
      // t.calculatearea();
      // t.draw();
      // c.draw();
       c1.draw();
       t1.calculatearea();
         }catch(Throwable e){
             e.getMessage();
             System.out.println("Type cast exeption");
             
         }
    }

   
}
