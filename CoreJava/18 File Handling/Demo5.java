// example showing the concept of file handling 

import java.util.Scanner;
import java.io.*;
class Demo5{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\newFile.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content : ");
        String content = sc.nextLine();
        try(FileOutputStream fout = new FileOutputStream(file,true)){    
            byte bt[] = content.getBytes();
            fout.write(bt);
            //fout.close();
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}