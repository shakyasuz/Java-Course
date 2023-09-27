package Unit1;
import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        //creating a new file 
    try{
        File f1= new File("csit.txt");
        if(!f1.exists()){
            f1.createNewFile();
        
        }else{
            System.out.println("File already exists");
        }
        //some methods of file handling
        System.out.println("name of file is"+f1.getName());
         System.out.println("path of file is"+f1.getPath());
        System.out.println("absolute path of file is"+f1.getAbsolutePath());
        System.out.println("size of file is"+f1.getTotalSpace());
    }catch(IOException i){
        System.out.println(i);
    }
    }
}
