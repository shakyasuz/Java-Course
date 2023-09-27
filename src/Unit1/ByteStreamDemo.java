package Unit1;
import java.io.*;
//Stream is a seq of data. in java input output is done throgh stream 
//Bytestream : read and write data throh=ugh sequence of byte. two classes are used 
//FileInputStream: to read data from file through byte stream 
//FileOutputStream: to write data into fole through byte stream

public class ByteStreamDemo {
    public static void main(String[] args) {
        //writing into file through byte stream
        try{
            FileOutputStream fos= new FileOutputStream("csit.txt");
            String data ="this is csit 7th semester";
            //converting into byte
            byte[] b1=data.getBytes();
            fos.write(b1);
            System.out.println("content written successfully");
            //reading data from file using byte stream
            FileInputStream fis=new FileInputStream("csit.txt");
            int res;
            while((res=fis.read())!=-1){
                System.out.print((char)res);
            }
        }catch(IOException i){
            System.out.println(i);   
        }
    }
}
