package Unit1;
//declared using abstract method and its object cannot be created 
//It can have instance variable, constructor, methods and abstract method 
//abstract method are such which do not have implementation part and 
// are only declared. Abstract class should be inherited by normal class and such normal clss should provide body part of abstract methods 
abstract class Calcs{
    //instance variable
    private int x;
    private int y;
    //constructor
    public Calcs(int x, int y){
        this.x=x;
        this.y=y;
    }
    //normal method 
    public void add(){
        System.out.println("addition is"+(this.x+this.y));
        
    }
    //abstract method
    public  abstract void subtract(int x1, int y1);
    public abstract int multiplication(int x1, int y1);
}
class solution2 extends Calcs{ //to call super class we must have sub class 
    private int x2;
    private int y2;
        public solution2(int x2, int y2, int x, int y){
            super(x,y);//calls constructor of calcs
            this.x2=x2;
            this.y2=y2;
        }
        //normal method
         public void division(){
             System.out.println("Division is"+(this.x2/this.y2));
         }
         //overriding abstract method providing details of abstract method 
         @Override 
         public void subtract (int x1, int y1){
             System.out.println("subtraction is:"+(x1-y1));
         }
         @Override 
         public int  multiplication(int x1, int y1) {
             return (x1*y1);
         }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        solution2 s1=new solution2(5,10,2,4);
        s1.add(); //method of calcs superclass
        s1.subtract(3, 5);//abstract method 
        s1.division(); //own method 
        int mul1=s1.multiplication(10, 2);
        System.out.println("multiplication is "+ mul1);
        //using reference of abstract class
        Calcs c1;
        c1=s1; //subclass ko object subclass ma halne is dynamic method dispatch 
        c1.add();
        int mul2=c1.multiplication(100, 20);
        System.out.println("multiplication is "+mul2);
        c1.subtract(100,50);
    }
    
}
