// example showing the concept of file handling 
import java.io.*;
class Demo10{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
        
        try(FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);){    
          System.out.println("Integer value : "+din.readInt());     
          System.out.println("Boolean value : "+din.readBoolean());     
          System.out.println("Double value : "+din.readDouble());     
          System.out.println("String Data : "+din.readUTF());     
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}