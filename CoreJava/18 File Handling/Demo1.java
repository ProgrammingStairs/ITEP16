// example showing the concept of file handling 

import java.io.File;
class Demo1{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder created successfully");
        }else{
            System.out.println("Folder Already exist");         
        }
    }
}