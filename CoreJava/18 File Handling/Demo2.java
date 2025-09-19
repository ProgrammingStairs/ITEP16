// example showing the concept of file handling 

// import java.io.File;
// import java.io.IOException;

import java.io.*;
class Demo2{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder\\file2.xlsx");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }else{
                System.out.println("File Already exist");         
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}