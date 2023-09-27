package Unit1;
import java.io.*;
//serialization is the process of writing object to the file 
    //deserialization is the process of reading object from the file 
    //following classes are used 
    //ObjectOutputStream: to write object
    //objectInputStream: to read object
    class Rectangles implements Serializable{
        private int length;
        private int breadth;
        public Rectangles(int length, int breadth){
            this.length=length;
            this.breadth=breadth;
            
        }
        public void calcArea(){
            System.out.println("area is" + (this.length * this. breadth));
        }
        public void calcPeri(){
            System.out.println("perimeter is " + (2*(this.length+ this.breadth)));
        }
    }
public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Rectangles r1= new Rectangles(30,50);
            //opening a file for write 
            FileOutputStream fos=new FileOutputStream("csit.txt");
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(r1); //writing object to file 
            System.out.println("object written successfully");
            fos.close();
            oos.close();
            //decentralization 
            FileInputStream fis= new FileInputStream( "csit.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Rectangles r2= (Rectangles)ois.readObject();
            r2.calcArea();
            r2.calcPeri();
            fis.close();
            ois.close();
        }catch(IOException i){
            System.out.println(i);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }
    }
}
