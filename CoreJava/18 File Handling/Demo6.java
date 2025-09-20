// example showing the concept of file handling 
import java.io.*;
class Demo6{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
        try(FileInputStream fin = new FileInputStream(file)){    
           while(true){
                int x = fin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
           }     
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}