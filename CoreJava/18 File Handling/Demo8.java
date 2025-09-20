// example showing the concept of file handling 
import java.io.*;
class Demo8{
    public static void main(String args[]){
        File file1 = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile1.txt");
        File file2 = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile2.txt");
        
        try(FileInputStream fin1 = new FileInputStream(file1);
        FileInputStream fin2 = new FileInputStream(file2);
        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);){    
           while(true){
                int x = sin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
           }     
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}