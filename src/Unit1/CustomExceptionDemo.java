//to create own error(exception)we have to use superclass exception
//step1: create error class by extending superclass exception
//step2: use override method to String() to return error message 
//step 3: use throw to explicitly throw own error
//step4:  use throws if error is generated from method 
//step5: use try catch to handle error thrown from method 
package Unit1;
class NegativeAreaException extends Exception{
    @Override
    public String toString(){
        //toString is compulsory to be used 
        return ("area cannot be negative");
    }
}
    class Rectangle{
    public void calcArea(int length, int breadth)throws NegativeAreaException{
        if(length<0 || breadth <0){
            throw new NegativeAreaException();
        }else{
            System.out.println("Area is" + (length *breadth ));
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        try{
            r1.calcArea(20,-30);
        }catch(NegativeAreaException n){
            System.out.println(n);
        }
        System.out.println("Out of block");
    }
    
}

