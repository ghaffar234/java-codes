
package Polimorphism;


public class Test {
    public static void main(String[] args) {
        bird b=new bird();
        Animal a4=null;
        a4.running();
        b.running();
        Dogs d=new Dogs();
        d.running();
        Animal a=new bird();
        a.running();
        Animal a1= (Animal)a;
        a1.running();
        Animal a2=new Dogs();
        a2.running();
        Animal a3=(Animal)a2;
        
        System.out.println("final answer of down casting");
        a3.running();
        
    }
    
}
