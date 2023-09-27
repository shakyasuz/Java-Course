package Unit1;
//using multithreading, a program can do multiple task at a same time 
//there are two ways to use multithreading in java
//implementing runnable interface 
//inheriting (extends)thread class
class Calculation3 extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=50; i++){
            System.out.println("Calculation3:" + i);
            try{
                Thread.sleep(1000); //1 sec delay 
            }catch(InterruptedException j){
                System.out.println(j);
            }
        }
    }
}
class Calculation4 extends Thread{
    @Override
    public void run(){
        for(int i =1; i <=50; i++){
            if(i%2==0){
                System.out.println("Calculation4:" + i);
                try{
                    Thread.sleep(500); //1 sec delay
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            }
        }
    }
    
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Calculation3 c3= new Calculation3();
        Calculation4 c4= new Calculation4();
        c3.start();
        c4.start();
    }
}
