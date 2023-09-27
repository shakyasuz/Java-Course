package Unit1;
//in inheritnace if super class and sub class have methods with same name and same signature(return type and parameters).
//to call overriden methods of superclss, super keyword should be used 
class Calculation{
    public void calc1(){
        System.out.println("This is calc1 of superclass");
    }
    public void calc2(int x, int y){
        System.out.println("sum is " + (x+y));
    }
}
class Solution extends Calculation{
    @Override //parent class ko kei cheese subclass a copy gareko vayera rakheko 
    public void calc1(){
        super.calc1(); //calls calc1 of parent calculation
        System.out.println("This is calc1 of subclass");
    }
    @Override
    public void calc2(int x, int y){
    super.calc2(x,y);
        System.out.println("Difference is " +(x-y));
    }
}
   
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Solution s1= new Solution ();
        s1.calc1();
        s1.calc2(20,30);
        
    }
}
