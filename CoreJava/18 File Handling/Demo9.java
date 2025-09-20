// example showing the concept of file handling 

import java.io.*;
class Demo9{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fout);){    
            dos.writeInt(10101);
            dos.writeBoolean(true);
            dos.writeDouble(456.654);
            dos.writeUTF("This is an example");
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}