package Unit1;
//using runnable interface 
//to implement runnable interface  using implements 
class Calculation5 implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=50; i++){ //display from 1 to 50 
            System.out.println("Calculation5:" + i);
            try{
                Thread.sleep(1000); //1 sec delay 
            }catch(InterruptedException j){
                System.out.println(j);
            }
        }
    }
}
class Calculation6 implements Runnable{
    @Override
    public void run(){ //even numbers
        for(int i =1; i <=50; i++){
            if(i%2==0){
                System.out.println("Calculation6:" + i);
                try{
                    Thread.sleep(2000); //1 sec delay
                }catch(InterruptedException j){
                    System.out.println(j);
                }
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Calculation5 c5=new Calculation5 ();
        Calculation6 c6 =new Calculation6();
        Thread t1=new Thread(c5);
        Thread t2=new Thread(c6);
        t1.run();
        t2.run();
    }
    
}
