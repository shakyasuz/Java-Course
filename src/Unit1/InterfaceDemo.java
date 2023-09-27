package Unit1;
//It is like a abstract class but difference is that it only consists 
//list of abstract method. It doesnt have normal method, constructor.
//if instance variable is declared it will be final (constant) by default 
//it is declared using interface keyword and cannot be instantiated 
interface Calcs1{
    //list of abstract method 
    void add(int x, int y);
    void diff(int x, int y);
    int mul(int x, int y);
}
class Sols1 implements Calcs1{
    @Override
    public void add(int x, int y){
        System.out.println("Addition is"+(x+y));
    }
    @Override
    public void diff(int x, int y ){
        System.out.println("difference is"+(x-y));
    }
    @Override
    public int mul(int x, int y){
        return (x*y);
    }
    
}

public class InterfaceDemo{
    public static void main(String[] args) {
        Sols1 s1= new Sols1();
        s1.add(10,20);
        s1.diff(30,20);
        int mul1= s1.mul(10,5);
        System.out.println("multiplication is "+ mul1);
        //using interface reference 
        Calcs1 c1;
        c1=s1; //dynamic method dispatch
        c1.add(10,20);
        c1.diff(20, 2);
        int mul2=c1.mul(100, 20);
        System.out.println("multiplication is "+ mul2);
        c1.diff(100,20);
        
        
    }
}