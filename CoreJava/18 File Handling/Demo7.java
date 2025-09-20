// example showing the concept of file handling 

import java.util.Scanner;
import java.io.*;
class Demo7{
    public static void main(String args[]){
        File file1 = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile1.txt");
        
        File file2 = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile2.txt");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content : ");
        String content = sc.nextLine();

        try(FileOutputStream fout1 = new FileOutputStream(file1);
        FileOutputStream fout2 = new FileOutputStream(file2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){    
            byte bt[] = content.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}