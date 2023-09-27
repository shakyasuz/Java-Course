package Unit1;
import java.io.*;
//character strean can read and write through string
//uses two classes
//FileReader:to read data from file
//FileWriter: to write data into file 

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("csit.txt");
            String data="Hello this is second last class for basics";
            fw.write(data);
            System.out.println("Content written successfully");
            fw.close();
            //read
            FileReader fr=new FileReader("csit.txt");
            int res;
            while((res=fr.read())!=-1){
                System.out.print((char)res);
            }
            fr.close();
        }catch(IOException i){
            System.out.println(i);
        }
    }
    
}
