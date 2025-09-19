// example showing the concept of file handling 

import java.io.*;
class Demo3{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\ITEP_BATCH_16th\\ITEP16\\CoreJava\\18 File Handling\\myFolder");
        File frr[] = file.listFiles();
        for(File fobj : frr){
            if(fobj.getName().endsWith(".java"))
                System.out.println("File name : "+fobj.getName()+"\tPathname : "+fobj.getPath());
        }
    }
}